package org.jruby.cs453;

import java.util.ArrayList;

public class TypeClass {

  private TypeTrait mTrait;

  // for function type, return type + parameter types
  private TypeClass mRetType;
  private ArrayList<TypeClass> mArgTypes;

  // for generate new name of a type variable
  static private int mTypeVarCounter = 0;
  private int mTypeVarIndex;

  public int getTypeVarIndex() {
    return mTypeVarIndex;
  }

  public void setTypeVarIndex( int index ) {
    mTypeVarIndex = index;
  }

  public TypeTrait getTypeTrait() { return mTrait; }

  public void setTypeTrait(TypeTrait trait) { mTrait = trait; }

  /*
   * Constructor
   */
  public TypeClass() {
    mTrait = TypeTrait.UNDET; 
    mTypeVarIndex = mTypeVarCounter++;
  }

  public TypeClass(TypeTrait trait) {
    mTrait = trait;
    if ( trait == TypeTrait.UNDET ) {
      mTypeVarIndex = mTypeVarCounter++;
    }
  }
 
  public TypeClass(TypeClass ty) {
    mTrait = TypeTrait.UNDET;
    mTypeVarIndex = mTypeVarCounter++;
    mergeTypeClass(ty);
  }

  /*
   * Method type related type information
   */
  public void setFuncType(TypeClass ret) {
    mRetType = ret;
  }
  public void setFuncType(ArrayList<TypeClass> args) {
    mArgTypes = args;
  }
  public void setFuncType(ArrayList<TypeClass> args, TypeClass ret) {
    mArgTypes = args;
    mRetType = ret;
  }
  public TypeClass getRetType() { return mRetType; }
  public ArrayList<TypeClass> getArgType() { return mArgTypes; }

  
  
  /*
   * utility function, to dump type class
   */
  public String toString() {
    switch (mTrait) {
      case INT:    return "INT";
      case BOOL:   return "BOOL";
      case FUNC:
        String str = "";
        for ( TypeClass t : mArgTypes ) {
          if (t != null ) {
          	str =  str + ", " + t.toString();
          }
        }
        if ( str != "" ) {
          str = str.substring(2);
        }
        else {
          str = "-";
        }
        if (mRetType != null ) {
            str = str + " => " + mRetType.toString();
        } else {
        	str = str + " => ";
        }
        return "FUNC: " + str;
      case NIL:    return "NIL";
      case POLY:   return "POLY"; /* a method's argument could have more than one type, type ERROR */
      case UNDET:  return "a" + mTypeVarIndex; /* type variable, aX */
    }
    return "";
  }

  // to resolve type information as inference goes
  private TypeTrait mergeTrait(TypeTrait t1, TypeTrait t2) {
    if ( t1 == t2 ) { return t1; }
    if ( t1 == TypeTrait.UNDET ) { return t2; }
    if ( t2 == TypeTrait.UNDET ) { return t1; }
    // unification of ANY and UNDET is ANY
    // unification of Bool and Int is POLY (error)
    // FIXME:  those are the only basic type traits -- compound types aren't handled yet.
    return TypeTrait.POLY;
  }

  public void mergeTypeClass( TypeClass guestType ) {
    if ( mTrait != guestType.getTypeTrait() ) {
      mTrait = mergeTrait( mTrait, guestType.getTypeTrait() );
      guestType.setTypeTrait(mTrait);  // type traits should be the same
    }
    
    // unify undetermined variables to the earlier variable
    if ( mTrait == TypeTrait.UNDET ) {
      if ( mTypeVarIndex < guestType.getTypeVarIndex() ) {
        guestType.setTypeVarIndex( mTypeVarIndex );
      }
      else {
        mTypeVarIndex = guestType.getTypeVarIndex();
      }
    }
    // handle compound types
    if ( mTrait == TypeTrait.FUNC && 
      guestType.getTypeTrait() == TypeTrait.FUNC ) {
      TypeClass ret = guestType.getRetType();
      if(mRetType==null) {
        mRetType = ret;
        mTypeVarIndex = guestType.getTypeVarIndex();
        
      }
      else {
        mRetType.mergeTypeClass(ret);
      }
      /* FIXME assume that the two to-be-merged methods have same number 
       * of args
       */
      if(mArgTypes!=null) {
        int n = 0;
        for ( TypeClass t : mArgTypes ) {
          t.mergeTypeClass(guestType.getArgType().get(n));
          n = n + 1;
        }
      }
      else {
        mArgTypes = guestType.getArgType();
        mTypeVarIndex = guestType.getTypeVarIndex();
      }
    }
  }

  public boolean isUndet() {
    return mTrait == TypeTrait.UNDET;
  }
}

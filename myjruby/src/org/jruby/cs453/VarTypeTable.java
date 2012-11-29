package org.jruby.cs453;

import org.jruby.ast.Node;
import org.jruby.ast.NodeType;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;

public class VarTypeTable implements IVarTypeTable  {
	
	private Map<String, TypeClass> mVarTypeTable;
	private IVarTypeTable parent = null;
	
	public VarTypeTable() {
		mVarTypeTable    = new HashMap<String, TypeClass>();	
	}
	public TypeClass get(String var) {
		if ( mVarTypeTable.containsKey(var) ) { 
			return this.mVarTypeTable.get(var);
		} else if (parent!=null ) {
			return parent.get(var);
		} else {
		    return this.mVarTypeTable.get(var);//FIXME -- currently returns null -- should this throw an error?
		}
	}

	public TypeClass put(String var, TypeClass guestClass) {
	
	
		return mVarTypeTable.put(var, guestClass);
	}

	public TypeClass update(String var, TypeClass guestClass) {
	
	
	
		return mVarTypeTable.put(var, guestClass);
	}
	
	public Boolean containsKey(String var) {
	
		return mVarTypeTable.containsKey(var);
	}
	
	public Set<String> keySet() {
	
		return mVarTypeTable.keySet();
	}

	public IVarTypeTable getParent() {
		return parent;
	}
	public void setParent(IVarTypeTable newparent) {
		parent = newparent;
	}
	public void addBinaryOp(String sym, TypeClass left, TypeClass right,TypeClass retType) {
		TypeClass bin = new TypeClass(TypeTrait.FUNC);
        ArrayList<TypeClass>  args = new ArrayList<TypeClass>();
        args.add(left );
        args.add(right );
        bin.setFuncType(args, retType );
        mVarTypeTable.put(sym,bin);	
	}
}
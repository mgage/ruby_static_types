package org.jruby.cs453;

// gage-- I think we need to expand the FUNC typetrait to handle the argument traits somehow
public enum TypeTrait {
  INT,  // integer 
  BOOL, // bool
  FUNC, // function(closure)
  NIL,  // if a function returns nothing, set its type to nil
  POLY, // for function parameters, it could have polymorphic type, when we see this type, it's actually a type error
  UNDET // polymorphic type(type variable)
}

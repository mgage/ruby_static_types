package org.jruby.cs453;

import java.util.Set;

import org.jruby.ast.Node;
import org.jruby.ast.NodeType;


interface INodeTypeTable  {

//

	TypeClass get(Node node);

	TypeClass put(Node node, TypeClass guestClass);

	TypeClass update(Node node, TypeClass guestClass);


}

interface IVarTypeTable  {


	TypeClass get(String var);

	TypeClass put(String var, TypeClass guestClass);

	TypeClass update(String var, TypeClass guestClass);
	
	Set<String> keySet();
	
	Boolean containsKey(String var);
	
	IVarTypeTable getParent();
	
	void setParent(IVarTypeTable p);
	
	void addBinaryOp(String sym, TypeClass left, TypeClass right,TypeClass retType);


}
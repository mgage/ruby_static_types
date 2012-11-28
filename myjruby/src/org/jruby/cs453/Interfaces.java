package org.jruby.cs453;

import org.jruby.ast.Node;
import org.jruby.ast.NodeType;


interface NodeTypeTable  {

//

	TypeClass get(Node node, TypeClass guestClass);

	TypeClass put(Node node, TypeClass guestClass);

	TypeClass update(Node node, TypeClass guestClass);


}

interface VarTypeTable  {

//

	TypeClass get(String var, TypeClass guestClass);

	TypeClass put(String var, TypeClass guestClass);

	TypeClass update(String var, TypeClass guestClass);


}
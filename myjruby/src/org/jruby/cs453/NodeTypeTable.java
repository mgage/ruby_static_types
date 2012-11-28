package org.jruby.cs453;

import org.jruby.ast.Node;
import org.jruby.ast.NodeType;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NodeTypeTable implements INodeTypeTable{

	private Map<Node, TypeClass> mNodeTypeTable    = new HashMap<Node, TypeClass> ();
	
	public TypeClass get(Node node) {
		return mNodeTypeTable.get(node);
	}

	public TypeClass put(Node node, TypeClass guestClass) {
		return mNodeTypeTable.put(node, guestClass);
	}

	public TypeClass update(Node node, TypeClass guestClass) {
		return mNodeTypeTable.put(node, guestClass);
	}

}
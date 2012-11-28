package org.jruby.cs453;

import org.jruby.ast.Node;
import org.jruby.ast.NodeType;

public class NodeTable implements NodeTypeTable{

	public TypeClass get(Node node, TypeClass guestClass) {
	return new TypeClass();
	}

	public TypeClass put(Node node, TypeClass guestClass) {
	return new TypeClass();
	}

	public TypeClass update(Node node, TypeClass guestClass) {
	return new TypeClass();
	}

}
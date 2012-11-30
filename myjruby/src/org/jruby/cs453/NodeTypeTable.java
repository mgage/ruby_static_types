package org.jruby.cs453;

import org.jruby.ast.Node;
import org.jruby.ast.NodeType;
import org.jruby.ast.types.INameNode;

import org.jruby.ast.CallNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;

public class NodeTypeTable implements INodeTypeTable{

	private Map<Node, TypeClass> mNodeTypeTable;
	
	private IVarTypeTable mVarTypeTable;
	
	public NodeTypeTable() {
		mNodeTypeTable    = new HashMap<Node, TypeClass> ();
	}
	
	public TypeClass get(Node node) {
		return mNodeTypeTable.get(node);
	}

	public TypeClass put(Node node, TypeClass guestClass) {
		return mNodeTypeTable.put(node, guestClass);
	}

	public TypeClass update(Node node, TypeClass guestClass) {
		return mNodeTypeTable.put(node, guestClass);
	}
	
	
	public void setVarTypeTable(IVarTypeTable tbl) {
		mVarTypeTable = tbl;
	}
	public IVarTypeTable getVarTypeTable() {
		return mVarTypeTable;
	}

	
/*
 * utility function to record binary operator node
 */
 
	public void update_binary_node( CallNode rcvrNode, Node firstArg, Node secondArg ) {
 	   // get types of argument nodes
		TypeClass left = mNodeTypeTable.get(firstArg);
           //System.out.println("left " + left);
        TypeClass right = mNodeTypeTable.get( secondArg );
           //System.out.println("right " + right);
        
        // get data from "type" of operation
        TypeClass funcType = mVarTypeTable.get(rcvrNode.getName());
        TypeClass ty_rcvr  = funcType.getRetType();
        ArrayList<TypeClass> args = funcType.getArgType();
        TypeClass ty_left  = args.get(0);
        TypeClass ty_right = args.get(1);
           
        // update node table -- check compatibility of actual type with signature and unify types
        // this action may propagate downward through child nodes and to symbols in the VarTypeTable
            /* ensure arguments are compatible with ints */
            /* this will also set the types of left and right to int */
            
        ty_left.mergeTypeClass(left);  
        ty_right.mergeTypeClass(right);
            
      
        // TO DO -- generalize this to more variables.
        // updating a var may cause the nodes that refer to it to be updated.
        // updating those nodes may cause parent and sibling nodes to be updated.
        
        mNodeTypeTable.put(rcvrNode, ty_rcvr);
        
        if (firstArg.getNodeType() == NodeType.LOCALVARNODE
            ||firstArg.getNodeType() == NodeType.DVARNODE) { // FIXME other nodes may be involved
        	mVarTypeTable.put( ( (INameNode)firstArg).getName(), ty_left);
        	mNodeTypeTable.put( firstArg, ty_left);
        }
        if (secondArg.getNodeType() == NodeType.LOCALVARNODE
            ||secondArg.getNodeType() == NodeType.DVARNODE) {
        	mVarTypeTable.put( ( (INameNode)secondArg).getName(), ty_right); 
        	mNodeTypeTable.put( secondArg, ty_left);
        } 
          	
	
	
	}
}
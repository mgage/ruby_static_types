package org.jruby.cs453;

import org.jruby.ast.Node;
import org.jruby.Ruby;

import java.io.PrintStream;
import java.util.List;
import java.util.ArrayList;

import java.util.HashMap;

public class TypeInference {
  
  public TypeInference(Node root, Ruby runtime) {

    mRoot = root;
    mRuntime = runtime;
    mTypeVisitor = new NodeTypeVisitor();
    // this prints the tree structure
    printTree(runtime.getOutputStream(), root, 0);
  }

  public void inferTypes(Node root) {
      // traverse the tree structure by calling the recursive routine traverseTree
      traverseTree(root);
  }


  private void traverseTree(Node node) {
    for(Node child : node.childNodes()) {
      traverseTree(child);
    }
    inferNodeType(node);
  }

  private void inferNodeType(Node node) {
    // this is where the work is done to record the Node type
    node.accept(mTypeVisitor);
  }
  
 public void printTypeInferResult() {
     // print node table
    printTree2(mRuntime.getOutputStream(), mTypeVisitor.getNodeTypeTable(), mRoot, 0);

    // prints symbol table
    mTypeVisitor.printVarTypeTable(mRuntime.getOutputStream());
  }

  private void printTree(PrintStream out, Node node, int depth) {
    for(int i=0; i<depth;i++) {
      out.print("    ");
    }
    out.println(node.getNodeType().toString() + " pos: " + node.getPosition());
    List<Node> children = node.childNodes();
    for(Node child : children) {
      printTree(out, child, depth+1);
    }
  }
   private void printTree2(PrintStream out, INodeTypeTable mNodeTable, Node node, int depth) {
    for(int i=0; i<depth;i++) {
      out.print("    ");
    }
    TypeClass mCurrentNodeType = (TypeClass) mNodeTable.get(node);
    if (mCurrentNodeType != null) {
    	out.println(node.getNodeType().toString() + " pos: " + node.getPosition() + "--" +mCurrentNodeType.toString());
    } else {
        out.println(node.getNodeType().toString() + " pos: " + node.getPosition() + "-- no type defined" );    
    }
    List<Node> children = node.childNodes();
    for(Node child : children) {
      printTree2(out, mNodeTable, child, depth+1);
    }
  }
  private NodeTypeVisitor mTypeVisitor;
  private Ruby mRuntime;
  private Node mRoot;
}

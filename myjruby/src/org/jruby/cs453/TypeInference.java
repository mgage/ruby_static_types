package org.jruby.cs453;

import org.jruby.ast.Node;
import org.jruby.Ruby;

import java.io.PrintStream;
import java.util.List;
import java.util.ArrayList;

public class TypeInference {

  public TypeInference(Node root, Ruby runtime) {

    mRoot = root;
    mRuntime = runtime;
    mTypeVisitor = new NodeTypeVisitor();
    printTree(runtime.getOutputStream(), root, 0);

  }

  public void inferTypes(Node root) {
//    for (int i = 1; i<=1; i++) {
      traverseTree(root);
//      traverseList(mTypeVisitor.getPendingList());
//    }
  }

/*
  private void traverseList(ArrayList<Node> list) {
    int deferNodeNum;
    do {
      deferNodeNum = list.size();
      for (int i=0;i<deferNodeNum;i++) {
        Node n = list.remove(0);
        //System.out.println("defer list : " + n.getNodeType().toString());
        inferNodeType(n);
      }
    } while ( deferNodeNum > list.size() );
  }
*/
  private void traverseTree(Node node) {
    for(Node child : node.childNodes()) {
      traverseTree(child);
    }
    inferNodeType(node);
  }

  private void inferNodeType(Node node) {
    node.accept(mTypeVisitor);
  }
  
  public void printTypeInferResult() {
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

  private NodeTypeVisitor mTypeVisitor;
  private Ruby mRuntime;
  private Node mRoot;
}

package org.jruby.cs453;

import org.jruby.ast.visitor.NodeVisitor;

import org.jruby.ast.Node;
import org.jruby.ast.AliasNode;
import org.jruby.ast.AndNode;
import org.jruby.ast.ArgsCatNode;
import org.jruby.ast.ArgsNode;
import org.jruby.ast.ArgsPushNode;
import org.jruby.ast.ArgumentNode;
import org.jruby.ast.ArrayNode;
import org.jruby.ast.AttrAssignNode;
import org.jruby.ast.BackRefNode;
import org.jruby.ast.BeginNode;
import org.jruby.ast.BignumNode;
import org.jruby.ast.BlockArgNode;
import org.jruby.ast.BlockArg18Node;
import org.jruby.ast.BlockNode;
import org.jruby.ast.BlockPassNode;
import org.jruby.ast.BreakNode;
import org.jruby.ast.CallNode;
import org.jruby.ast.CaseNode;
import org.jruby.ast.ClassNode;
import org.jruby.ast.ClassVarAsgnNode;
import org.jruby.ast.ClassVarDeclNode;
import org.jruby.ast.ClassVarNode;
import org.jruby.ast.Colon2Node;
import org.jruby.ast.Colon3Node;
import org.jruby.ast.ConstDeclNode;
import org.jruby.ast.ConstNode;
import org.jruby.ast.DAsgnNode;
import org.jruby.ast.DRegexpNode;
import org.jruby.ast.DStrNode;
import org.jruby.ast.DSymbolNode;
import org.jruby.ast.DVarNode;
import org.jruby.ast.DXStrNode;
import org.jruby.ast.DefinedNode;
import org.jruby.ast.DefnNode;
import org.jruby.ast.DefsNode;
import org.jruby.ast.DotNode;
import org.jruby.ast.EncodingNode;
import org.jruby.ast.EnsureNode;
import org.jruby.ast.EvStrNode;
import org.jruby.ast.FCallNode;
import org.jruby.ast.FalseNode;
import org.jruby.ast.FixnumNode;
import org.jruby.ast.FlipNode;
import org.jruby.ast.FloatNode;
import org.jruby.ast.ForNode;
import org.jruby.ast.GlobalAsgnNode;
import org.jruby.ast.GlobalVarNode;
import org.jruby.ast.HashNode;
import org.jruby.ast.IfNode;
import org.jruby.ast.InstAsgnNode;
import org.jruby.ast.InstVarNode;
import org.jruby.ast.IterNode;
import org.jruby.ast.LambdaNode;
import org.jruby.ast.LiteralNode;
import org.jruby.ast.LocalAsgnNode;
import org.jruby.ast.LocalVarNode;
import org.jruby.ast.Match2Node;
import org.jruby.ast.Match3Node;
import org.jruby.ast.MatchNode;
import org.jruby.ast.ModuleNode;
import org.jruby.ast.MultipleAsgn19Node;
import org.jruby.ast.MultipleAsgnNode;
import org.jruby.ast.NewlineNode;
import org.jruby.ast.NextNode;
import org.jruby.ast.NilNode;
import org.jruby.ast.NodeType;
import org.jruby.ast.NotNode;
import org.jruby.ast.NthRefNode;
import org.jruby.ast.OpAsgnAndNode;
import org.jruby.ast.OpAsgnNode;
import org.jruby.ast.OpAsgnOrNode;
import org.jruby.ast.OpElementAsgnNode;
import org.jruby.ast.OrNode;
import org.jruby.ast.PostExeNode;
import org.jruby.ast.PreExeNode;
import org.jruby.ast.RedoNode;
import org.jruby.ast.RegexpNode;
import org.jruby.ast.RescueBodyNode;
import org.jruby.ast.RescueNode;
import org.jruby.ast.RestArgNode;
import org.jruby.ast.RetryNode;
import org.jruby.ast.ReturnNode;
import org.jruby.ast.RootNode;
import org.jruby.ast.SClassNode;
import org.jruby.ast.SValueNode;
import org.jruby.ast.SelfNode;
import org.jruby.ast.SplatNode;
import org.jruby.ast.StrNode;
import org.jruby.ast.SuperNode;
import org.jruby.ast.SymbolNode;
import org.jruby.ast.ToAryNode;
import org.jruby.ast.TrueNode;
import org.jruby.ast.UndefNode;
import org.jruby.ast.UntilNode;
import org.jruby.ast.VAliasNode;
import org.jruby.ast.VCallNode;
import org.jruby.ast.WhenNode;
import org.jruby.ast.WhileNode;
import org.jruby.ast.XStrNode;
import org.jruby.ast.YieldNode;
import org.jruby.ast.ZArrayNode;
import org.jruby.ast.ZSuperNode;

import org.jruby.ast.ListNode;
import org.jruby.ast.types.INameNode;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class NodeTypeVisitor implements NodeVisitor {


    // constructor
    public NodeTypeVisitor() {
      mNodeTypeTable       = new HashMap<Node, TypeClass>();
      mVarTypeTable        = new HashMap<String, TypeClass>();
      //mMethodTypeSpecTable = new HashMap<String, TypeClass>();
      //mPendingNodeList     = new ArrayList<Node>();
    }

/*
    public ArrayList<Node> getPendingList() {
      return mPendingNodeList;
    }

    private Boolean pending(Node node) {
      return mPendingNodeList.contains(node);
    }

    private void defer(Node node) {
      mPendingNodeList.add(node);
    }
*/
    public void printVarTypeTable(PrintStream out) {
      for (String s : mVarTypeTable.keySet()) {
        out.println(s + " : " + mVarTypeTable.get(s).toString());
      }
    }
    public HashMap getNodeTypeTable() {
    	return mNodeTypeTable; 
    }

    public String visitAliasNode(AliasNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitAndNode(AndNode node) {
       Node first = node.getFirstNode();
      Node second = node.getSecondNode();
      TypeClass left = mNodeTypeTable.get(first);
      TypeClass right = mNodeTypeTable.get(second);
      TypeClass ty = new TypeClass(TypeTrait.BOOL);
      ty.mergeTypeClass(left);
      ty.mergeTypeClass(right);
      System.out.println("AND node");
      mNodeTypeTable.put(node, ty   );
      // FIXME -- need to assign type to arguments as well and their children
      mNodeTypeTable.put(first, new TypeClass(TypeTrait.BOOL ) );
      mNodeTypeTable.put(second,  new TypeClass(TypeTrait.BOOL) );
 
      System.out.println(first.getNodeType());
      if ( first.getNodeType() == NodeType.VCALLNODE ||
           first.getNodeType() == NodeType.LOCALVARNODE) {
            System.out.println( first + "var name =" + ( (INameNode)first).getName() );
      		mVarTypeTable.put( ( (INameNode)first).getName(), new TypeClass(TypeTrait.BOOL ));
      }
      if ( second.getNodeType() == NodeType.VCALLNODE ||
           second.getNodeType() == NodeType.LOCALVARNODE ) {
            System.out.println( second + "var name =" + ( (INameNode)second).getName() );
      		mVarTypeTable.put( ( (INameNode)second).getName(), new TypeClass(TypeTrait.BOOL ));
      }
      return node.getNodeType().toString();
    }

    /*
     * method arguments
     */
    public String visitArgsNode(ArgsNode node) {
      ListNode preArgList = node.getPre();
      int preArgCount = node.getPreCount();
      int argIndex;
      ArrayList<TypeClass> argTypeList = new ArrayList<TypeClass>();

      for(argIndex=0;argIndex<preArgCount;argIndex++) {
        Node arg = preArgList.get(argIndex);
        String argName = ((ArgumentNode)arg).getName();

        /* TODO bind argName to a new type variable */
        TypeClass newArgType = new TypeClass();
        mVarTypeTable.put(argName, newArgType);

        argTypeList.add(mVarTypeTable.get(((ArgumentNode)arg).getName()));
      }
      TypeClass methodType = new TypeClass(TypeTrait.FUNC);
      methodType.setFuncType(argTypeList);
      mNodeTypeTable.put(node, methodType);
      return node.getNodeType().toString();
    }

    public String visitArgsCatNode(ArgsCatNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitArgsPushNode(ArgsPushNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    /*
     * a general array, could be an array literal, quoted 
     * words or args
     */
    public String visitArrayNode(ArrayNode node) {
      return node.getNodeType().toString();
    }

    public String visitAttrAssignNode(AttrAssignNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitBackRefNode(BackRefNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitBeginNode(BeginNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitBignumNode(BignumNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitBlockArgNode(BlockArgNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitBlockArg18Node(BlockArg18Node iVisited) {
      return iVisited.getNodeType().toString();
    }

    /*
     * block of nodes, as list, as method body
     */
    public String visitBlockNode(BlockNode node) {
      List<Node> stmts = node.childNodes();
      int stmtNum = stmts.size();
      if(stmtNum==0) 
        mNodeTypeTable.put(node, new TypeClass(TypeTrait.NIL));
      Node lastStmt = stmts.get(stmtNum-1);
      //if ( pending(lastStmt) ) {
      //  defer(node);
      //}
      //else {
        mNodeTypeTable.put(node, mNodeTypeTable.get(lastStmt));
      //}
      return node.getNodeType().toString();
    }

    public String visitBlockPassNode(BlockPassNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitBreakNode(BreakNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitConstDeclNode(ConstDeclNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitClassVarAsgnNode(ClassVarAsgnNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitClassVarDeclNode(ClassVarDeclNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitClassVarNode(ClassVarNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    /*
     * A ruby method call, first child is receiver
     * second child is array, as args
     */ 
    public String visitCallNode(CallNode node) {

      if ( node.getName() == "new" ) {
        ConstNode  recv = (ConstNode)node.getReceiverNode();
        IterNode   iter = (IterNode)node.getIterNode();
        if (recv.getName() == "Proc" ) {
          mNodeTypeTable.put(node, mNodeTypeTable.get(iter));
        }
        return node.getNodeType().toString();
      }
      // FIXME
      if ( node.getName() == "+" || node.getName() == "-"
        || node.getName() == "*" || node.getName() =="/" ) {
        
        // get argument nodes
        //FIXME -- why won't getArgsNode work???
        List<Node> argNodes = node.childNodes();
        Node first = argNodes.get(0);  
        Node second =  argNodes.get(1) .childNodes() .get(0);       
        //System.out.println("first " + first + " second " + second );
        //System.out.println("inside second" + ( second.childNodes() ) );
        
        /*
        	proposed abstraction:
        	update_node( receiver_node: node, argument_node1: first, argument_node2: second )
        */
        
        // get types of argument nodes
        TypeClass left = mNodeTypeTable.get(first);
           //System.out.println("left " + left);
        TypeClass right = mNodeTypeTable.get( second );
           //System.out.println("right " + right);
        // get data from current node
        
        // get data from "type" of operation
           TypeClass ty_rcvr = new TypeClass(TypeTrait.INT);
           TypeClass ty_left = new TypeClass(TypeTrait.INT);
           TypeClass ty_right = new TypeClass(TypeTrait.INT);
        // update node table -- check compatibility of actual type with signature and unify types
        // this action may propagate downward through child nodes and to symbols in the VarTypeTable
            /* ensure arguments are compatible with ints */
            ty_left.mergeTypeClass(left);  
            ty_right.mergeTypeClass(right);
            /* this should also reset the types of left and right to int */
      
        
        // update var table from node table
        // updating a var may cause the nodes that refer to it to be updated.
        // updating those nodes may cause parent and sibling nodes to be updated.
        if (first.getNodeType() == NodeType.LOCALVARNODE) { // FIXME other nodes may be involved
        	mVarTypeTable.put( ( (INameNode)first).getName(), new TypeClass(TypeTrait.INT ));
        }
        if (second.getNodeType() == NodeType.LOCALVARNODE) {
        	mVarTypeTable.put( ( (INameNode)second).getName(), new TypeClass(TypeTrait.INT )); 
        } 
        mNodeTypeTable.put(node, ty_rcvr);  // return value is INT
        return node.getNodeType().toString();
      }
      if ( node.getName() == "!" ) {
       
        // get argument nodes
          //FIXME -- why won't getArgsNode work???
        Node argNode = node.childNodes().get(0);
        System.out.println("NOT node");
        System.out.println(node);
        System.out.println("argsNode " + argNode);
		// call update node
			// get data from "type" of operation (receiver node)
			TypeClass ty_rcvr = new TypeClass(TypeTrait.BOOL); // return value must be Bool
			TypeClass ty_left = new TypeClass(TypeTrait.BOOL); // argument value must be Bool
			// get types of argument nodes
			TypeClass arg = mNodeTypeTable.get(argNode); // get type of argument node
			// update node table -- check compatibility of actual type with signature and unify types
    		ty_left.mergeTypeClass(arg);  /* ensure arg is compatible with Bool */
        	System.out.println("after merge types  are " + ty_left + " " + arg);   
			mNodeTypeTable.put(argNode, ty_left ); //argument value is BOOL
			mNodeTypeTable.put(node, ty_rcvr); // return value is BOOL
			// update var table from node table (this should propagate)
			mVarTypeTable.put( ( (INameNode)argNode).getName(), ty_left );   

        return node.getNodeType().toString();
      }
      if ( node.getName() == "call" ) {
        /* TODO Problem here */
        Node recvNode = node.getReceiverNode();
        Node argsNode = node.getArgsNode();
        List<Node> args = argsNode.childNodes();
        ArrayList<TypeClass> argTypeList = new ArrayList<TypeClass>();
        if(args.size()==0) {
          argTypeList.add(new TypeClass(TypeTrait.NIL));
        }
        else {
          for( Node n : args ) {
            TypeClass argType = mNodeTypeTable.get(n);
            argTypeList.add(argType);
          }
        }

        /* TODO infer method's return type */
        TypeClass methodRetType = new TypeClass();
        TypeClass methodType = new TypeClass(TypeTrait.FUNC);
        methodType.setFuncType(argTypeList, methodRetType);

        TypeClass procEntityType = mNodeTypeTable.get(recvNode);
        procEntityType.mergeTypeClass(methodType);
        mNodeTypeTable.put(node, procEntityType.getRetType());
        return node.getNodeType().toString();
      }
      //INameNode recv = (INameNode)node.getReceiverNode();
      if(mVarTypeTable.containsKey(node.getName())) {
         
          System.out.println(node.getName());
          mNodeTypeTable.put(node, mVarTypeTable.get(node.getName()).getRetType());
      }
      return node.getNodeType().toString();
    }

    public String visitCaseNode(CaseNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitClassNode(ClassNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitColon2Node(Colon2Node iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitColon3Node(Colon3Node iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitConstNode(ConstNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    /*
     * dynamically assign a variable
     */
    public String visitDAsgnNode(DAsgnNode node) {
      return node.getNodeType().toString();
    }

    public String visitDRegxNode(DRegexpNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    /*
     * dynamically defined string
     */
    public String visitDStrNode(DStrNode node) {
      return node.getNodeType().toString();
    }

    public String visitDSymbolNode(DSymbolNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    /*
     * dynamically referenced variable
     */
    public String visitDVarNode(DVarNode node) {
      if ( !mVarTypeTable.containsKey(node.getName()) ) {
        TypeClass newTypeVar = new TypeClass();
        mNodeTypeTable.put(node, newTypeVar);
        mVarTypeTable.put(node.getName(), newTypeVar);
      }
      else {
        mNodeTypeTable.put(node, mVarTypeTable.get(node.getName()));
      }
      return node.getNodeType().toString();
    }

    public String visitDXStrNode(DXStrNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitDefinedNode(DefinedNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    /*
     * define a method
     */
    public String visitDefnNode(DefnNode node) {
      List<Node> children = node.childNodes();
      ArgsNode args = (ArgsNode)children.get(1);
      Node body = children.get(2);
      String funcName = node.getName();

      ArrayList<TypeClass> argTypeList = mNodeTypeTable.get(args).getArgType();
      TypeClass retType  = mNodeTypeTable.get(body);
      TypeClass funcType = new TypeClass(TypeTrait.FUNC);
      funcType.setFuncType( argTypeList, retType );
      /* check whether we have speculated the method type 
       * if yes, merge the speculation with newly determined type
       * otherwise, continue insert into VarTypeTable
       */
        
      if ( mVarTypeTable.containsKey(funcName) ) {
        funcType.mergeTypeClass(mVarTypeTable.get(funcName));
      }
        
      mVarTypeTable.put( funcName, funcType );
      return node.getNodeType().toString();
    }

    public String visitDefsNode(DefsNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitDotNode(DotNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitEncodingNode(EncodingNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitEnsureNode(EnsureNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitEvStrNode(EvStrNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    /*
     * method call with self as an implicit receiver
     */
    public String visitFCallNode(FCallNode node) {
      String funcName = node.getName();

      Node argsNode = node.getArgsNode();
      ArrayList<TypeClass> argTypeList = new ArrayList<TypeClass>();
      if(argsNode!=null) {
        List<Node> args = argsNode.childNodes();
        for( Node n : args ) {
          TypeClass argType = mNodeTypeTable.get(n);
          argTypeList.add(argType);
        }
      }
      else {
        argTypeList.add(new TypeClass(TypeTrait.NIL));
      }

      /* TODO infer method's return type */
      TypeClass methodRetType = new TypeClass();
      TypeClass methodType = new TypeClass(TypeTrait.FUNC);
      methodType.setFuncType(argTypeList, methodRetType);

      /* merge newly determined type + speculated type into VarTypeTable */
      //if ( mVarTypeTable.containsKey(funcName) ) {
        /* method has already been determined type 
         * unify the record in VarTypeTable
         */
      //  mVarTypeTable.get(funcName).mergeTypeClass(methodType);
      //}
      //else {
      //  mVarTypeTable.put(funcName, methodType);
      //}
       
      return node.getNodeType().toString();
    }

    /*
     * False node represents false
     */
    public String visitFalseNode(FalseNode node) {
      mNodeTypeTable.put(node, new TypeClass(TypeTrait.BOOL));
      return node.getNodeType().toString();
    }

    /*
     * Fixnum is an int
     */
    public String visitFixnumNode(FixnumNode node) {
      //if ( ! mNodeTypeTable.containsKey(node) ) {
        mNodeTypeTable.put(node, new TypeClass(TypeTrait.INT));
      //}
      return node.getNodeType().toString();
    }

    public String visitFlipNode(FlipNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    /*
     * Float is float
     */
    public String visitFloatNode(FloatNode node) {
      return node.getNodeType().toString();
    }

    public String visitForNode(ForNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitGlobalAsgnNode(GlobalAsgnNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitGlobalVarNode(GlobalVarNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitHashNode(HashNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitInstAsgnNode(InstAsgnNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitInstVarNode(InstVarNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    /*
     * if node is if statement
     */
    public String visitIfNode(IfNode node) {
      Node condNode = node.getCondition();
      Node thenNode = node.getThenBody();
      Node elseNode = node.getElseBody();
      TypeClass condType = mNodeTypeTable.get(condNode);
      if ( null==condType || condType.getTypeTrait() != TypeTrait.BOOL ) {
        /* if condition doesn't propagated from below OR
           it's not BOOL type
         */
        // TODO
        System.out.println("Type error for if-then-else");
      }
      TypeClass thenType = mNodeTypeTable.get(thenNode);
      if ( null!=elseNode ) {
        TypeClass elseType = mNodeTypeTable.get(elseNode);
        thenType.mergeTypeClass(elseType);
        //elseType.mergeTypeClass(thenType);
      }
      mNodeTypeTable.put(node, thenType);
           
      return node.getNodeType().toString();
    }

    /*
     * iterator node, the second child node of call node of Proc.new
     */
    public String visitIterNode(IterNode node) {
      
      List<Node> children = node.childNodes();
      ArgsNode args = (ArgsNode)children.get(0);
      Node body = children.get(1);

      ArrayList<TypeClass> argTypeList = mNodeTypeTable.get(args).getArgType();
      TypeClass retType  = mNodeTypeTable.get(body);
      TypeClass funcType = new TypeClass(TypeTrait.FUNC);
      funcType.setFuncType( argTypeList, retType );
 
      mNodeTypeTable.put(node, funcType);
      return node.getNodeType().toString();
    }

    public String visitLambdaNode(LambdaNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitLiteralNode(LiteralNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    /*
     * Assignment propagates type from declare side(right) 
     * to define side(left)
     */
    public String visitLocalAsgnNode(LocalAsgnNode node) {
      	// get argument nodes
      	   //List<Node> children = ;
      	   Node rhs_node = node.childNodes().get(0);
      	
		// call update node
			// get data from "type" of operation (receiver node)
			   // not applicable
			// get types of argument nodes
			   TypeClass  ty_rhs = mNodeTypeTable.get(rhs_node); //type of RHS

			// update node table -- check compatibility of actual type with signature and unify types
			// update var table from node table
 
			  if ( !mVarTypeTable.containsKey(node.getName()) ) {   
				// FIXME -- should we be creating a new type class here?
				// I think not -- this slaves the node type to the symbol type 
				// updating one automatically updates the other -- this is appropriate for assignment     
				mVarTypeTable.put(node.getName(), ty_rhs);
				mNodeTypeTable.put(node, ty_rhs );
			  } else {
				TypeClass lhsType = mVarTypeTable.get(node.getName() );
				lhsType.mergeTypeClass(ty_rhs);
			  }
      //System.out.println("LocalAsgnNode");
      //System.out.println("LHS: " + mVarTypeTable.get(node.getName()) + "  RHS: " + ty_rhs);    
      return node.getNodeType().toString();
    }

    /*
     * local variable reference
     */
    public String visitLocalVarNode(LocalVarNode node) {
      /*
       * if var is in mVarTypeTable, var has determined
       * type, otherwise defer it
       */
        // get argument nodes
            // there are none
		// call update node
			// get data from "type" of operation (receiver node)
			   //not applicable
			// get types of argument nodes
			// update node table -- check compatibility of actual type with signature 
			// and unify types
			// update var table from node table
			  if ( !mVarTypeTable.containsKey(node.getName()) ) {
				TypeClass newTypeVar = new TypeClass();
				mNodeTypeTable.put(node, newTypeVar);
				mVarTypeTable.put(node.getName(), newTypeVar);
			  }
			  else {
				mNodeTypeTable.put(node, mVarTypeTable.get(node.getName()));
			  }
      return node.getNodeType().toString();
    }

    public String visitMultipleAsgnNode(MultipleAsgnNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitMultipleAsgnNode(MultipleAsgn19Node iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitMatch2Node(Match2Node iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitMatch3Node(Match3Node iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitMatchNode(MatchNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitModuleNode(ModuleNode iVisited) {
      return iVisited.getNodeType().toString();
    }
 
    /*
     * a new line
     */
    public String visitNewlineNode(NewlineNode node) {
      Node child = node.childNodes().get(0);
    
      //if ( pending(child) ) {
      //  defer(node);
      //}
      //else {
        mNodeTypeTable.put(node, mNodeTypeTable.get(child));
      //} 
        
      return node.getNodeType().toString();
    }

    public String visitNextNode(NextNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitNilNode(NilNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitNotNode(NotNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitNthRefNode(NthRefNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitOpElementAsgnNode(OpElementAsgnNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitOpAsgnNode(OpAsgnNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitOpAsgnAndNode(OpAsgnAndNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitOpAsgnOrNode(OpAsgnOrNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    /* Handle OR node */
    public String visitOrNode(OrNode node) {
      Node first = node.getFirstNode();
      Node second = node.getSecondNode();
      TypeClass left = mNodeTypeTable.get(first);
      TypeClass right = mNodeTypeTable.get(second);
      TypeClass ty = new TypeClass(TypeTrait.BOOL);
      ty.mergeTypeClass(left);
      ty.mergeTypeClass(right);
      //System.out.println("OR node");
      mNodeTypeTable.put(node, ty   );
      // FIXME -- need to assign type to arguments as well and their children
      mNodeTypeTable.put(first, new TypeClass(TypeTrait.BOOL ) );
      mNodeTypeTable.put(second,  new TypeClass(TypeTrait.BOOL) );
 
      System.out.println(first.getNodeType());
      if ( first.getNodeType() == NodeType.VCALLNODE ||
           first.getNodeType() == NodeType.LOCALVARNODE) {
            //System.out.println( first + "var name =" + ( (INameNode)first).getName() );
      		mVarTypeTable.put( ( (INameNode)first).getName(), new TypeClass(TypeTrait.BOOL ));
      }
      if ( second.getNodeType() == NodeType.VCALLNODE ||
           second.getNodeType() == NodeType.LOCALVARNODE ) {
            //System.out.println( second + "var name =" + ( (INameNode)second).getName() );
      		mVarTypeTable.put( ( (INameNode)second).getName(), new TypeClass(TypeTrait.BOOL ));
      }
      return node.getNodeType().toString();
    }

    public String visitPreExeNode(PreExeNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitPostExeNode(PostExeNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitRedoNode(RedoNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitRegexpNode(RegexpNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitRescueBodyNode(RescueBodyNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitRescueNode(RescueNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitRestArgNode(RestArgNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitRetryNode(RetryNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitReturnNode(ReturnNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    // Nothing to do for root node
    public String visitRootNode(RootNode node) {
      return node.getNodeType().toString();
    }

    public String visitSClassNode(SClassNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitSelfNode(SelfNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitSplatNode(SplatNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    /*
     * constant string
     */
    public String visitStrNode(StrNode node) {
      return node.getNodeType().toString();
    }

    public String visitSuperNode(SuperNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitSValueNode(SValueNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitSymbolNode(SymbolNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitToAryNode(ToAryNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    /*
     * true node represents true
     */
    public String visitTrueNode(TrueNode node) {
      mNodeTypeTable.put(node, new TypeClass(TypeTrait.BOOL));
      return node.getNodeType().toString();
    }

    public String visitUndefNode(UndefNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitUntilNode(UntilNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitVAliasNode(VAliasNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    /*
     * ruby method without any arg, could be an object,
     * as a receiver of method call
     */
    public String visitVCallNode(VCallNode node) {
      /*
       * if var is in mVarTypeTable, var has determined
       * type, otherwise defer it
       */
      if ( mVarTypeTable.containsKey(node.getName()) ) {
        TypeClass methodType = mVarTypeTable.get(node.getName());
        /* FIXME   -- this still isn't completely right */
        //mNodeTypeTable.put(node, methodType.getRetType());
          mNodeTypeTable.put(node, methodType);
      }
      else {
        TypeClass varType = new TypeClass();
        mNodeTypeTable.put(node, varType);
        mVarTypeTable.put(node.getName(), varType);
      }
      return node.getNodeType().toString();
    }

    public String visitWhenNode(WhenNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitWhileNode(WhileNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitXStrNode(XStrNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitYieldNode(YieldNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitZArrayNode(ZArrayNode iVisited) {
      return iVisited.getNodeType().toString();
    }

    public String visitZSuperNode(ZSuperNode iVisited) {
      return iVisited.getNodeType().toString();
    }
 

    // private ArrayList<Node> mPendingNodeList;
    /* mapping each node to a type */
    private HashMap<Node, TypeClass>   mNodeTypeTable;
    /* mapping each variable to a type */
    private HashMap<String, TypeClass> mVarTypeTable;
    /* maintaining partial method type information */ 
    //private HashMap<String, TypeClass> mMethodTypeSpecTable;
} 

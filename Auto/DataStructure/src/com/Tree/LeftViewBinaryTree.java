package com.Tree;


public class LeftViewBinaryTree {
	Node root;
	static int max_leval=0;
	
	public void leftView(){
		leftViewTree(root,1);
	}

	public void leftViewTree(Node node, int leval) {
		
		if(node==null){//Base case 
			return;
		}
		if(max_leval<leval){//if this is the first node of leval
			System.out.println(node.data);
			max_leval=leval;
		}
	//	Recur left and right subtree
		leftViewTree(node.leftNode, leval+1);
		leftViewTree(node.rightNode, leval+1);
			
		
		
	}

	public static void main(String[] args) {
LeftViewBinaryTree lvb=new LeftViewBinaryTree();
lvb.root=new Node(4);
lvb.root.leftNode=new Node(3);
lvb.root.rightNode=new Node(5);
lvb.root.rightNode.rightNode=new Node(6);
lvb.root.leftNode.leftNode=new Node(2);
lvb.root.leftNode.leftNode.leftNode=new Node(1);
System.out.println("printing left view");

lvb.leftView();

	}

}

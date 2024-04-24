package com.Tree;

public class Treemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree tree=new Tree();
		tree.insert(25);
		tree.insert(20);
		tree.insert(15);
		tree.insert(27);
		tree.insert(30);
		tree.insert(29);
		tree.insert(26);
		tree.insert(22);
		tree.insert(32);
		
		System.out.println("in order Traversal:");
		tree.inOrderTraversal();
/*		
		System.out.println();
		System.out.println("pre order Traversal:");
		tree.preOrderTraversal();
		System.out.println();
		System.out.println("post order Traversal:");
		tree.postOrderTraversal();*/
	
		System.out.println();
		System.out.println(tree.get(25));
	
		

	}

}

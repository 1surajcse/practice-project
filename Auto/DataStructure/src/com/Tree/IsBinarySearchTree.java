package com.Tree;


/*class Node
{
	 Node leftNode;
	Node rightNode;
	int data;
	
	public Node(int data)
	{
		this.data=data;
	}
	
}

public class IsBinarySearchTree {
	Node root;
	

	 boolean isBST(){
	
		 return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE)	;
	}
	boolean isBSTUtil(Node node,int min,int max)
	{
		if(node==null)
			return true;
		
		if(node.data<min||node.data>max)
			return false;
		
	return (isBSTUtil(node.leftNode, min, node.data-1)&&isBSTUtil(node.rightNode, node.data+1, max));
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("min::"+Integer.MIN_VALUE);
		 System.out.println("Max::"+Integer.MAX_VALUE);
		IsBinarySearchTree bt=new IsBinarySearchTree();
		bt.root=new Node(4);
		bt.root.leftNode=new Node(3);
		bt.root.leftNode.leftNode=new Node(2);
		bt.root.rightNode=new Node(5);
		
		if(bt.isBST())
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("NO");
		}
		

	}
*/
class Node{
	Node leftNode;
	Node rightNode;
	int data;
	public Node(int data){
		this.data=data;
	}
	
}
public class IsBinarySearchTree{
	Node root;
	boolean isBST()
	{
		return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	public boolean isBSTUtil(Node node, int minValue, int maxValue) {
		if(node==null){
		return true;
	}
		if(minValue>node.data||maxValue<node.data){
			return false;
		}
		
		return isBSTUtil(node.leftNode, minValue, node.data-1)&&isBSTUtil(node.rightNode, node.data+1, maxValue);
	}
	public static void main(String[] args) {
		IsBinarySearchTree bst=new IsBinarySearchTree();
		 bst.root=new Node(4);
		 bst.root.leftNode=new Node(3);
		 bst.root.rightNode=new Node(5);
		 bst.root.rightNode=new Node(3);
		 
		 if(bst.isBST())
		 {
			 System.out.println("yes");
		 }
		 else
		 {
			 System.out.println("No");
		 }

	}
}

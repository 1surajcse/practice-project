package com.Tree;

public class TreeNode {

	private int data;
	private TreeNode left;
	private TreeNode right;
	
	
	public void inOrderTraversal()
	{
		if(left!=null)
		{
			left.inOrderTraversal();
		}
	
		System.out.print(data+",");
		if(right!=null)
		{
			right.inOrderTraversal();
		}
		
	}
	
	
	public void preOrderTraversal()
	{
		System.out.print(data+",");
		if(left!=null)
		{
			left.preOrderTraversal();
		}
		
		if(right!=null)
		{
			right.preOrderTraversal();
		}
		
	}
	public void postOrderTraversal()
	{
	
		if(left!=null){
			left.postOrderTraversal();
		}
		
		if(right!=null){
			right.postOrderTraversal();
		}
		System.out.print(data+",");
		
	}
	
	public TreeNode get(int value){
		if(value==data){
			return this;
		}
		
		if(value<data){
			if(left!=null){
			return left.get(value);
			}
		}
		else{
			if(right!=null){
		    return right.get(value);
			}
		}
		return null;
	}

	public void insert(int value)
	{
		if(value==data){
			return ;
		}
		if(value<data){
			if(left==null){
				left=new TreeNode(value);
			}
			else{
				left.insert(value);	
			}
		}
		else{
			if(right==null){
				right=new TreeNode(value);

			}
			else{
				right.insert(value);
			}
		}
	}


	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public TreeNode(int data) { 
		this.data = data;

	}
	public void setRight(TreeNode right) {
		this.right = right;
	}

}

package com.Tree;

public class Tree {
	
	private TreeNode root;
	
	public void insert(int value)
	{
		if(root==null){
			root=new TreeNode(value);
		}
		else{
			root.insert(value);
		}
	}
	
	public TreeNode get(int value)
	{
		if(root!=null)
		{
			return root.get(value);
		}
		
		return null; 
	}
	
	public int getMin()
	{
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		return root.getLeft().getData();
	}
	
	public void inOrderTraversal()
	{
		if(root!=null)
		{
			root.inOrderTraversal();
		}
		
	}
	public void preOrderTraversal()
	{
		if(root!=null)
		{
			root.preOrderTraversal();
		}
		
	}

	public void postOrderTraversal()
	{
		if(root!=null)
		{
			root.postOrderTraversal();
		}
		
	}

	

	
	

}

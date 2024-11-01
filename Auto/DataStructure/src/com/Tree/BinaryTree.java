package com.Tree;

class Node1{
    int data;
    Node1 left, right;
    public Node1(int item){
        data = item;
        left = right = null;
    }
}
class BinaryTree {
	Node1 root;
	public BinaryTree(){
		root=null;
	}
	 void printLevalOrder() {
		int height=getHeight(root);
		for(int i=1;i<=height;i++){
			printGivenLeval(root,i);
		}

	}
	 int getHeight(Node1 node) {
			if(node==null){
				return 0;
			}
			else{
				int lHeight=getHeight(node.left);
				int rHeight=getHeight(node.right);
				if(lHeight>rHeight){
					return lHeight+1;
				}
				else return rHeight+1;
			}
		}


	 void printGivenLeval(Node1 node, int leval) {
		if(node==null){
			return;
		}
		if(leval==1){
			System.out.print(node.data+" "); 
		}
		else if(leval>1){
			printGivenLeval(node.left,leval-1);
			printGivenLeval(node.right,leval-1);
		}

	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree tree=new BinaryTree();
		tree.root= new Node1(1);
		tree.root.left =new Node1(2);
		tree.root.right= new Node1(3);
		tree.root.left.left= new Node1(4);
		tree.root.left.right= new Node1(5);

		System.out.println("Level order traversal of binary tree is ");
		tree.printLevalOrder();
	}




}

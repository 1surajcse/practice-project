public class LinkedListDemo{
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	//Insert at the Front of the list
	public void insertAtFront(int data){
		Node newNode=new Node(data);
		newNode.next=head;
	    head=newNode;
	}
	public void deleteFront(){
		if(head==null)
		{
			System.out.println("NA");
			return;
		}
		head=head.next;
	}
	//insert at the Given Node
	
	
	
	
	public void insertAfter(Node preNode,int data)
	{
		if(preNode==null)
		{
			System.out.println("cant insert as given node is empty");
			return;
		}
		Node newNode=new Node(data);
	
		newNode.next=preNode.next;
		preNode.next=newNode;
		
	}
	
	public void deleteAfter(Node preNode)
	{
		if(preNode==null)
		{
			System.out.println("cant delete as given node is empty");
			return;
		}
		if(preNode.next.next!=null)
		{
			System.out.println("inside if");
		preNode=preNode.next.next;
		}
		else
		{
			preNode.next=null;
		}
		
	}
	
	public void insertAtEnd(int data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		Node last=head;
		
		if(last==null)
		{
			last=new Node(data);
			return;
		}
		while(last.next!=null)
		{
			last=last.next;
		}
		
		last.next=newNode;
	}
	public void deleteLastnode()
	{
		
		Node last=head;
		
		if(last==null)
		{
			System.out.println("no node to delete");
			return;
		}
		while(last.next!=null)
		{
			last=last.next;
		}
		
		last.next=null;
	}
	
	
	public void print()
	{
		Node tnode=head;
		
		while(tnode!=null)
		{
			System.out.print(tnode.data+" ");
			tnode=tnode.next;
		}
		return;
	}
	public void printReverse(Node node)
	{
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
	
	//Reversing linked list using iterative
	public Node reverseLinkedList(Node node)
	{
		Node preNode =null;
		Node nextNode=null;
		Node current=node;
		
		while(current!=null)
		{
			nextNode=current.next;
			current.next=preNode;
			preNode=current;
			current=nextNode;
		}
		//node=preNode;
		return preNode;
		
	}
	//Reverse linked list using Recursion
	public Node reverseRecursion(Node current,Node preNode)
	{
		if(current.next==null){
			head=current;
			current.next=preNode;
			return null;
		}
		
	Node next1	=current.next;
	current.next=preNode;

	reverseRecursion( next1,current);
	return head;
		
	}
	
	// insertion in sorted order in linked list
	public void  sortedInsersion(int data){
	
		if(head==null ||head.data>=data){
			
			insertAtFront(data);
			return;
		}
		
		Node current=head.next;
		Node preNode=head;
		
		while(current!=null && current.data<data){
			preNode=current;
			current=current.next;
		}
		
		Node newNode=new Node(data);
		newNode.next=current;
		preNode.next=newNode;
	}
	
	public static void main(String[] args) {
		
		LinkedListDemo linkedListDemo=new LinkedListDemo();
		//linkedListDemo.insertAtFront(0);
		linkedListDemo.sortedInsersion(0);
		//linkedListDemo.insertAtFront(1);
		linkedListDemo.sortedInsersion(3);
		
		//linkedListDemo.insertAtEnd(7);
		linkedListDemo.sortedInsersion(2);
		//linkedListDemo.insertAtFront(3);
		linkedListDemo.sortedInsersion(7);
		//linkedListDemo.insertAtEnd(6);
		linkedListDemo.sortedInsersion(6);
      //  linkedListDemo.insertAfter( linkedListDemo.head.next.next, 4);
		System.out.println("Linked List");
		linkedListDemo.print();
		
		System.out.println("Linked List after delete");
		linkedListDemo.deleteFront();
	/*	linkedListDemo.deleteAfter(linkedListDemo.head.next);
		linkedListDemo.deleteLastnode();*/
		linkedListDemo.print();
		
       Node head=linkedListDemo.reverseLinkedList(linkedListDemo.head);  
       
		System.out.println("ReverseLinked List Head::"+head.data);
		
		linkedListDemo.printReverse(head);
		head=linkedListDemo.reverseRecursion(head, null);
		System.out.println("Reverse linked list using recursion");
		linkedListDemo.printReverse(head);
		
	}
	
}



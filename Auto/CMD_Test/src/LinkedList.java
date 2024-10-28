public class LinkedList {

	Node head;

	class Node{
		int data;
		Node next;
		public  Node(int data){
			this.data=data;
		}

	}

	//Insert Node at the front
	public void insertAtFront(int data){
		if(head==null){
			head=new Node(data);
			return;
		}

		Node newNode =new Node(data);
		newNode.next=head;
		head=newNode;

	}
	//Insert node after
	public void insertAfter(Node preNode,int data){

		if(preNode==null){
			System.out.println("Pre Node is empty");
			return;
		    }
		Node newNode=new Node(data);
		newNode.next=preNode.next;
		preNode.next=newNode;

	}
	
	public void insertAtEnd(int data){
		if(head==null){
			head=new Node(data);
			return;
		}
		
		Node newNode=new Node(data);
		newNode.next=null;
		Node current=head;
		
		while(current.next!=null)
		{
			current=current.next;
		}
		
		current.next=newNode;
		
		return;
	}
	
	public void sortedInsertion(LinkedList ll,int data)
	{
		if(head!=null){
			if(head.data>data){
				ll.insertAtFront(data);
			}
		}
		else{
			head=new Node(data);
		}
		Node current=ll.head;
		while(current.data<data)
		{
			ll.insertAfter(current, data);
		}
		
		ll.insertAtEnd(data);
		
	}
	
	public void printList(){
		Node current=head;
		while(current!=null){
		System.out.print(current.data+",");
		current=current.next;
		}
		return;
		
	}
	
	public void printReverseList(Node head){
		Node current=head;
		while(current!=null){
		System.out.print(current.data+",");
		current=current.next;
		}
		return;
		
	}
	public Node reverse(Node node){
		Node nextNode=null;
		Node pre=null;
		Node current =node;
		while(current!=null){
			nextNode=current.next;
			current.next=pre;
			pre=current;
			current=nextNode;
		}
		return pre;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll =new LinkedList();
		ll.sortedInsertion(ll,2);
		ll.sortedInsertion(ll,5);
		
		ll.sortedInsertion(ll, 4);
		ll.sortedInsertion(ll,6);
		ll.sortedInsertion(ll, 3);
		System.out.println("LinkedList::");
		ll.printList();
		System.out.println(ll.head.data);
	    Node Head= ll.reverse(ll.head);
		System.out.println(Head.data);
	    System.out.println();
	     System.out.println("Reverse List");
	     ll.printReverseList(Head);

	}

}



public class MiddleElementOfLinkedList {
	
	Node head=null;
	class Node
	{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
		}
	}
	public void getMiddle()
	{
		Node fast=head;
		Node slow=head;
		 if (head != null)
	        {
		while(fast!=null&&fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		System.out.println("Middleelement:"+slow.data);
	}
		
	}
	public void push(int data){

		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	
	}
	public void print(){
		if(head==null){
			System.out.println("No data");
		}
		Node current=head;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}

	}

	public static void main(String[] args) {
	
		MiddleElementOfLinkedList middleElementOfLinkedList=new MiddleElementOfLinkedList();
		middleElementOfLinkedList.push(5);
		middleElementOfLinkedList.push(4);
		middleElementOfLinkedList.push(3);
		middleElementOfLinkedList.push(2);
		middleElementOfLinkedList.push(6);
		middleElementOfLinkedList.print();
		
		middleElementOfLinkedList.getMiddle();
	
		
	}

}

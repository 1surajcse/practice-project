
public class RotateALinkedList {
	Node head;
	
	class Node{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
		}
	}
	
	void push(int data){
		
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	public void print(){
	
		Node current=head;
		while(current!=null){
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println();
	}
	
	public void rotateList(int k){
		
		if(k==0){
			return;
		}
		Node current=head;
		int count=1;
		while(count<k&&current!=null){
			current=current.next;
			count++;
		}
		if(current==null){
			return;
		}
		Node kthNode=current;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=head;
		head=kthNode.next;
		kthNode.next=null;
	}
	public static void main(String[] args) {
		RotateALinkedList aLinkedList=new RotateALinkedList();
        // create a list 10->20->30->40->50->60
        for (int i = 60; i >= 10; i -= 10)
        	aLinkedList.push(i);
 
        System.out.println("Given list");
        aLinkedList.print();
 
        aLinkedList.rotateList(4);
 
        System.out.println("Rotated Linked List");
        aLinkedList.print();
	}

}

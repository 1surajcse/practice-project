package Queue;

import java.util.Arrays;

public class Queue<T> {
	int rear;
	int front;
	int size;

	Object queue[];

	public Queue(int size){
		this.size=size;

		queue=new Object[this.size];
		front=-1;
		rear=-1;

	}

	public T dQueue(){
		if(front==-1||front>rear){
			System.out.println("queue is empty");
			return null;
		}
		else{
		T obj=(T)queue[front];
			front=front+1;
			System.out.println("deleted element::"+obj);
			return obj;
		}
	}
	public void queue(Object obj){
		if(rear==size-1){
			System.out.println("queue is Full");
			return;
		}

		rear=rear+1;
		if(front==-1){
			front=0;
		}
		queue[rear]=obj;

		System.out.println("Inserted element::"+obj);




	}



	@Override
	public String toString() {
		return "Queue [rear=" + rear + ", front=" + front + ", size=" + size + ", queue=" + Arrays.toString(queue)
		+ "]";
	}

	public static void main(String[] args) {

		Queue<String>queue=new Queue<String>(3);
		queue.queue("SAM");
		queue.queue("SAMa");
		queue.queue("SuMan");
		System.out.println(queue);

		
		System.out.println(queue.dQueue());
	}

}

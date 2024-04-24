package com.stack;

public class NextGreatorNumber {
	
	static class Stack{
		int top;
		int  []items=new int[100];
		//First will create the stack class and stack functions used by stack
		public void push(int data){
			if(top==99){
				System.out.println("stack is full");
			}
			else{
				items[++top]=data;
			}
		}
		 int pop(){
			if(top==-1){
				System.out.println("stack is empty");
				return -1;
			}
			else{
				int element=items[top];
				top--;
				return element;
			}
		
		}
		 boolean isEmpty(){
			 if(top==-1) {
				 return true;
			 }
			 else{
				 return false;
			 }
		 }
	}

	public static void main(String[] args) {

     int array[]={11,13,21,3};
     
 //  getNextGreator(array,array.length);//Solution 1-o(n)
     getNGEUsingStack(array,array.length);
  
	}

	private static void getNGEUsingStack(int[] array, int length) {
	int i=0;
	Stack stack=new Stack();
	stack.top=-1;
	int element,next;
	//push the first element to the stack
	stack.push(array[0]);
	
	for(i=1;i<length;i++)//iterate the rest of the element
	{
		next=array[i];
		if(stack.isEmpty()==false){
			element=stack.pop();
			
			while(element<next){
				
				System.out.println(element+"-->"+next);
				if(stack.isEmpty()==true){
	             break;
				}
				element=stack.pop();
			}
			if(element>next)
			{
				stack.push(element);
			}
		}
		stack.push(next);
	}
		while(stack.isEmpty()==false)
		{
			element=stack.pop();
			next=-1;
			System.out.println(element+"-->"+next);
			
		}
		
	}

	private static void getNextGreator(int[] array, int length) {
		
		int j=0;
		for(int i=0;i<length;i++)
		{ 
			int next=-1;
			for(j=i+1;j<length;j++)
			{
				if(array[i]<array[j])
				{
					next=array[j];
					break;
				}
			
			
			}
			
			System.out.println(array[i]+" Next Greater element::"+next);
		}
	}

}

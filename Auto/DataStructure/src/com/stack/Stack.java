package com.stack;

import java.util.Arrays;

public class Stack<T> {
	int size;
	Object stack[];
	int top=-1;

	public Stack(int size){
		this.size=size;
		stack=new Object[size];
	}
	
	public void push(Object obj){
		System.out.println(size);
		if(top==size-1){
			System.out.println("Stack is full");
		}
		else{
			top=top+1;
			stack[top]=obj;
		}
		
	}
	public Object pop(){
		if(top==-1){
			System.out.println("Stack is Empty");
			return null;
		}
		else{
			Object obj= stack[top];
			top=top-1;
			System.out.println("poped element::"+obj);
			return obj;
			
		}
		
	}

	public static void main(String[] args) {

  Stack<Integer> stack=new Stack<Integer>(4);
  stack.push(1);
  stack.push(2);
  stack.push(3);
  stack.push(4);
  Stack<String> stack1=new Stack<String>(4);
  stack1.push("Ram");
  stack1.push("Rema");
  stack1.push("Jaina");
  stack1.push("Renu");
  //stack.pop();
  System.out.println(stack1);
	}

	@Override
	public String toString() {
		return "Stack [size=" + size + ", stack=" + Arrays.toString(stack) + ", top=" + top + "]";
	}

}

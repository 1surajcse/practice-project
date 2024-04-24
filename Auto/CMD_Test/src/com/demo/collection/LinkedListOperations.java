package com.demo.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListOperations {

	public static void main(String[] args) {
		List<Integer>l=new LinkedList<Integer>();

		for(int i=0;i<10;i++){
			l.add(i);
		}
		System.out.println(l);
		
		/*for(int i=0;i<10;i++){
			l.remove(i);
		}*/
		l.remove(0);
		System.out.println(l);
		l.add(6,10);
		l.add(6,10);
		l.remove(1);
		l.remove(2);
	
		
		System.out.println(l);

	}

}

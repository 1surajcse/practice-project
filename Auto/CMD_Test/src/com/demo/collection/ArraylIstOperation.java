package com.demo.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraylIstOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l=new ArrayList<Integer>();

		for(int i=0;i<10;i++){
			l.add(i);
		}
		l.add(6,10);
		l.add(6,10);
		System.out.println(l);
		/*for(int i=0;i<10;i++){
			l.remove(i);
		}*/
		l.remove(1);
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.remove(6);
		System.out.println(l);
		l.remove(6);
		System.out.println(l);

	}
	

}

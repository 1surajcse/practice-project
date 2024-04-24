package com.demo.collection;

import java.util.HashSet;
import java.util.Set;

public class TreeSetOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HashSet::");
		Set<Integer>hs=new HashSet<>();
		hs.add(5);
		hs.add(3);
		hs.add(2);
		hs.add(2);
System.out.println(hs);
		hs.forEach(System.out::println);
		hs.remove(5);
		/*hs.remove(3);
		hs.remove(2);
		hs.remove(2);*/

		hs.forEach(System.out::println);
	}

}

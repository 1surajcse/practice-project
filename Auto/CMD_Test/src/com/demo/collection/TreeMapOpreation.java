package com.demo.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapOpreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new TreeMap<Integer,String>();
		map.put(5, "Rami");
		map.put(2, "Rami");
		map.put(3, "Rami");
		map.put(3, "Ramesh");
		System.out.println(map);
	}

}

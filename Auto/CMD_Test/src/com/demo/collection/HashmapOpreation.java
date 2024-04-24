package com.demo.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapOpreation {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(4, "Suraj");
		map.put(2, "Suresh");
		map.put(3, "Suman");
		map.put(null, "Suman");
		map.put(null, null);
		map.put(4, "null");
		System.out.println(map);
		Hashtable<Integer, String> ht=new Hashtable<>();
		ht.put(4, "Suraj");
		ht.put(5, "Suresh");
		ht.put(3, "Suman");
		ht.put(3, "Suman");
		
		System.out.println("check 1::"+ht);
	/*	System.out.println(map.get(0));
		System.out.println(map.containsKey(1));
		System.out.println(map.remove(1));*/
	

		Iterator<Entry<Integer, String>> ia=map.entrySet().iterator();

		while(ia.hasNext()){

			System.out.println(ia.next());

		}
		System.out.println("Hasmap::");
		Iterator<Entry<Integer, String>> hti=ht.entrySet().iterator();

		while(hti.hasNext()){

			System.out.println(hti.next());

		}

/*		for(Map.Entry<Integer, String> hm:map.entrySet())
		{
			System.out.println(hm.getKey()+hm.getValue());
		}
		System.out.println("check 2::");
		System.out.println(map.containsKey(1));
		System.out.println(map.get(1));*/


	}

}

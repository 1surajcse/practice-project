package CMD_Test.src.com.demo.collection;

import java.util.*;
import java.util.Map.Entry;

public class PracticeCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>al=new ArrayList<Integer>();

		for(int i=0;i<10;i++){
			al.add(i);

		}
		System.out.println(al);

		//	for(int i=0;i<4;i++){
		al.remove(1);
		al.remove(2);
		al.remove(0);
		al.remove(2);

		//}
		System.out.println(al);
		int a = 10;
		a=a<<1;
		System.out.println(a<<1);;
		System.out.println(a);

		HashMap<Integer, String> map=new HashMap<>();
		map.put(4, "Suraj");
		map.put(2, "Suresh");
		map.put(3, "Suman");
		map.put(null, "Suman");
		map.put(null, null);
		Hashtable<Integer, String> ht=new Hashtable<>();
		ht.put(4, "Suraj");
		ht.put(5, "Suresh");
		ht.put(3, "Suman");
		ht.put(3, "Suman");
		
		System.out.println("check 1::");
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

System.out.println("HashSet::");
Set<Integer>hs=new HashSet<>();
hs.add(5);
hs.add(3);
hs.add(2);
hs.add(2);

hs.forEach(System.out::println);
	}


}

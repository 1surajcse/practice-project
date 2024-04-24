package Java8Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.sound.midi.ControllerEventListener;

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		//A stream -just a sequence of items



		// Create an ArrayList
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(5);
		myList.add(8);
		//	myList.remove(2);

		// Convert it into a Stream
		Stream<Integer> myStream = myList.stream();
		myStream.forEach(System.out::println);//for each use in java 8

		Integer []arr={1,3,4};

		Stream<Integer> arrStream = Arrays.stream(arr);
		arrStream.forEach(System.out::print);

		//Filter method use
		List<String>list=new ArrayList<>();
		list.add("Ram");
		list.add("Ramu");
		list.add("Raman");
		list.add("Shyam");

		List<String>list1=list.stream().filter(x->x.startsWith("S")).collect(Collectors.toList());

		for (String string : list1) {
			System.out.println(string);
		}
		
		List<String>ss=new ArrayList<>();
		ss.add("fds");
		ss.add("dffd");
		List<String>ns=ss.stream().filter(x->x.endsWith("d")).collect(Collectors.toList());
		for (String string : ns) {
			System.out.println("new::"+string);
		}
		


		//map method use
		List<String>list2=list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		list2.forEach(System.out::println);

		//A reduction operation is one which allows you to compute a result using all the elements present in a stream.
		//Java 8 includes several reduction methods, such as sum, average and count, 

		int myArray[] = { 1, 5, 8 };

		//if want sum

		OptionalInt sum=Arrays.stream(myArray).reduce((a,b)-> a+b);
		System.out.println("sum:"+sum);
				If you want to perform more complex reduction operations, however, you must use the
		reduce method. Unlike the map and filter methods, the reduce method expects two arguments:
			an identity element, and a lambda expression. You can think of the identity element as an 
			element which does not alter the result of the reduction operation. For example, if you are
		trying to find the product of all the elements in a stream of numbers, the identity element would be the number 1.

		
		String[] myArray1 = { "this", "is", "a", "sentence" };
		String result = Arrays.stream(myArray1)
		                .reduce(" ", (a,b) -> a+" "+ b);
		System.out.println("Using Reduce:"+result);*/

		
		int []arrry={4,5,4,8};
		int sum1=Arrays.stream(arrry).reduce(1,(a,b)->a*b);
		System.out.println(sum1);
		
		String []sArray={"Rama","Is","Good","Girl"};
		
		String s=Arrays.stream(sArray).reduce("",(a,b)->a+b);
		System.out.println(s);
		
		List<String>ll=new ArrayList<>();
		ll.add("Ram");
		ll.add("Rama");
		ll.add("Raman");
		ll.add("Aaman");
		
		List<String>ss=ll.stream().filter(x->x.startsWith("R")).map(x->x.toUpperCase()).collect(Collectors.toList());
		ss.forEach(System.out::println);
	
		
	}

	}

package com.designPatterns;




public class Tripleton{


	public static void main(String[] args) {

		TripletonD obj1=TripletonD.getInstance();
		obj1.doSomething();

		TripletonD obj2=TripletonD.getInstance();
		obj2.doSomething();

		TripletonD obj3=TripletonD.getInstance();
		obj3.doSomething();

		TripletonD obj4=TripletonD.getInstance();
		obj4.doSomething();
		TripletonD obj5=TripletonD.getInstance();
		obj4.doSomething();

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println(obj5);

	}


}

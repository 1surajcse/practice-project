package com.designPatterns;



public class TripletonD {


	private static TripletonD instance;
	public static int count=0;

	private TripletonD(){
		count++;
	}
	public void doSomething(){
		if(count<=3){
		System.out.println(count+"Created");
		}else{
			System.out.println("Cant Create more than 3");
		}
	}
	public static synchronized TripletonD getInstance(){
		if(count<=3){
			instance=new TripletonD();
		}
		return instance;
	}

}

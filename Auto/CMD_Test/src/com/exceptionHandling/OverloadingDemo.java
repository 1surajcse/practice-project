package com.exceptionHandling;

public class OverloadingDemo {
	private  int a=0;
	public Integer m1(int a,int b){
		return a+b;
		
	}
  public Number m1(int a,int b,int c){
		return a+b+c;
	}

	public static void main(String[] args) {
		OverloadingDemo b=new OverloadingDemo();
	System.out.println(b.m1( 1,2));
	System.out.println(b.m1( 2,4,4));

	}

}

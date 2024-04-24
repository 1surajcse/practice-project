package com.javaBasics;

public class JavaOverloading {
	
/*	//1.
	private int  a=10;
	public void m1(){
		JavaOverloading javaOverloading=new JavaOverloading();
		int b	=javaOverloading.a;
		System.out.println(b);
	}*/
	
	
	//2.
/*	public int m1(int a,int b){
		int c;
		System.out.println("1::"+a+b);
		return a+b;
	}
	public Long m1(Integer a,Long b){
		System.out.println("2::"+a+b);
		return a+b;
	}
	
	public long m1(long a,int b){
		System.out.println("3::"+a+b);
		return a+b;
	}
	public Integer m1(long a,Integer b){
		System.out.println("4::"+a+b);
		return b;
	}
	
	public void m1(long a,long b){
		System.out.println("5::"+a+b);
	}*/
/*	public void m1(short a,short b){
		System.out.println("6::"+a+b);
	}*/
	/*public void m1(double a,double b){
		System.out.println("7::"+a+b);
	}*/
	
	public void m1(byte a,byte b){
		System.out.println("8::"+a+b);
	}
	
	/*public void m1(float a,float b){
		System.out.println("9::"+a+b);
	}*/
	
	
	public static void main(String[] args) {
		byte b=20;
		short  a=10000;
		int c=1000000000;
	   long d=1000000000000000000L;
	  float e=1000000000;
	  double f=100000000000000.00000000000000000000000000000000000000;

		
	System.out.println(a+b);
		JavaOverloading javaOverloading=new JavaOverloading();
		//System.out.println(javaOverloading.a);
		//javaOverloading.m1(a,b);
		
		
	}
	
	
	
}

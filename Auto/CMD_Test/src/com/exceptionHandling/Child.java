package com.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLDataException;

public class Child extends Parrent{

	public Child() throws SQLDataException{
		/*	m1();
		super.m1();*/
		System.out.println("inside Child class constructor::"+i);

		System.out.println("inside Child class constructor::"+super.i);
	}
	static{


		System.out.println("inside static block");
	}

	public  void m1() throws FileNotFoundException{
		System.out.println("inside parrent");

	}
	public Integer  m2(float a,float b)  {
		System.out.println("inside Child m2");

		int c=this.i;
		int d=super.i;

		System.out.println(c+d);

		return (int) (a+b);
	}

}

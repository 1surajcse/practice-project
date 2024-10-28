package com.threadDemo;

import java.util.ArrayList;
import java.util.List;

public class JoinExample {
	
	public static List<String>names= new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<SampleThread> list=new ArrayList<SampleThread>();
		for(int i=0;i<5;i++)
		{
			SampleThread e=new SampleThread();
			list.add(e);
			e.start();
		}
		   for(SampleThread st:list){
	            try{
	                st.join();
	            } catch (Exception ex){}
	        }
	        System.out.println(names);
	    }
		

	}

 class SampleThread extends Thread
	{
	 public void run(){
		for(int i=0; i<10; i++){
            try{
                Thread.sleep(10);
            } catch(Exception ex){}
        }
		JoinExample.names.add(getName());
		
	}
	}


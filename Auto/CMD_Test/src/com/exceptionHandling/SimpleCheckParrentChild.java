package com.exceptionHandling;

import java.sql.SQLDataException;

public class SimpleCheckParrentChild  {
 
	public static void main(String[] args) throws SQLDataException   {
		// TODO Auto-generated method stub
		
		
		
		Parrent p1=new Child();
		p1.m2(3,5);
	/*	Child c1=new Child();
		c1.m2(3, 5);*/
      
		  /* FileReader file = new FileReader("C:\\test\\a.txt"); 
	        BufferedReader fileInput = new BufferedReader(file); 
	          
	        // Print first 3 lines of file "C:\test\a.txt" 
	        for (int counter = 0; counter < 3; counter++)  
	            System.out.println(fileInput.readLine()); 
	          
	        fileInput.close(); */

		//fun();
		
		Throwable obj = new Throwable("Sample"); 
        try 
        { 
            throw obj; 
        }  
        catch (Throwable e1)  
        { 
            System.out.printf("8"); 
        } 
		
        

	}
	/*static void fun() throws NullPointerException
    { 
       
            throw new NullPointerException("demo"); 
         
           
            
    } */
   

}

package com.practice.check.externalization;/*
 * @author -Suraj Tiwari
 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        Employee e=new Employee();
        e.setId(1);
        e.setName("Suraj");

        FileOutputStream fileOutputStream=new FileOutputStream("Employee.ser");
        ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);

        outputStream.writeObject(e);
        outputStream.close();
        fileOutputStream.close();

        FileInputStream fis=new FileInputStream("Employee.ser");
        ObjectInputStream inputStream=new ObjectInputStream(fis);
        Employee obj=(Employee) inputStream.readObject();

        System.out.println(obj.getId()+":"+obj.getName());

        inputStream.close();
        fis.close();


    }
}

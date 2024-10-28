package com.practice.check;/*
 * @author -Suraj Tiwari
 */

import com.practice.check.asml.SingleTonDemo;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Driver {
    public static void main(String[] args) throws IOException, ClassNotFoundException, Exception {

        SingleTonDemo s1=SingleTonDemo.getInstance();
        SingleTonDemo s2=SingleTonDemo.getInstance();

        SingleTonDemo instance2=null;

        Constructor[]constructors= SingleTonDemo.class.getDeclaredConstructors();

     for (Constructor constructor:constructors){
         constructor.setAccessible(true);
         instance2=(SingleTonDemo) constructor.newInstance();
         break;
     }
        System.out.println(instance2);
        System.out.println(s1);
        System.out.println(s2);

        JavaReflection reflection=new JavaReflection("Suraj",31);

        System.out.println("started...");
        for (int i = 0; i < 10000; i++) {
            new JavaReflection("Java"+i,i);
        }


        System.out.println("Ended...");


        System.out.println("start...");
        Class refClass=reflection.getClass();
        Field[] fields=refClass.getDeclaredFields();

        for (Field field:fields){
           field.setAccessible(true);
            if(field.getName().equals("name")) {
                field.set(reflection,"Ram");
                System.out.println(field.getName());
            }

        }
        System.out.println(reflection.getName());

        //For Methods


        Method[] methods=refClass.getDeclaredMethods();

        //Arrays.stream(methods).map(m->m.getName()).forEach(System.out::println);

        for (Method method:methods){

            if(method.getName().equals("simpleStaticMethod")){
             //   method.setAccessible(true);
                System.out.println( method.invoke(null));
            }
        }

    }
}

package com.practice.check;/*
 * @author -Suraj Tiwari
 */

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) throws IOException, ClassNotFoundException, Exception {

        JavaReflection reflection=new JavaReflection("Suraj",31);
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

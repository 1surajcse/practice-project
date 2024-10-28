package com.user.service.userservice;

import com.user.service.userservice.entity.GenericDemo;
import com.user.service.userservice.entity.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
       String result=reverseString("Suraj");
        System.out.println("result = " + result+"::Sub::"+result.substring(1));
        GenericDemo<String>s=new GenericDemo<>();
        s.apply("Suraj");

        System.out.println("Generics::"+s.toString());
        List<Product> plist=new ArrayList<Product>();

        plist.add(new Product("Salt",4,50.0));
        plist.add(new Product("Pepsodent",5,59.0));
        plist.add(new Product("Maggi",1,30.0));
        plist.add(new Product("Sugar",1,40.0));

        Comparator<Product>pRatingSort=(p1,p2)->p1.getRating()-p2.getRating();
        Comparator<Product>priceSort=(p1,p2)-> (int) (p1.getPrice()-p2.getPrice());
        Comparator<Product>nameSort=(p1,p2)->p1.getProductName().compareTo(p2.getProductName());
        plist.stream().forEach(product -> System.out.println( product.getRating()+"-"+ product.getProductName()));
        System.out.println("__________________________");
        Collections.sort(plist,pRatingSort.thenComparing(nameSort.reversed()));
        plist.stream().forEach(product -> System.out.println( product.getRating()+"-"+ product.getProductName()));
       List<String> values=plist.stream().filter(p->p.getProductName().
               startsWith("S")).map(m->m.getProductName()).collect(Collectors.toList());

System.out.println("values:"+values);
    }

    public static String reverseString(String str){

        if(str.length()<1||str==null){
            return str;
        }
        return reverseString(str.substring(1))+str.charAt(0);
    }
}

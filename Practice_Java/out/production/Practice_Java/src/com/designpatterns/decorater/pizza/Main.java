package com.designpatterns.decorater.pizza;/*
 * @author -Suraj Tiwari
 */

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        Scanner sc1=new Scanner(System.in);
//        String s=sc.next();
//        int k=sc1.nextInt();
        String s="Hello.IP";
        String arr[]=s.split("\\.");
        boolean check=false;
        System.out.println(Arrays.toString(arr));
        if(arr.length!=4){
            System.out.println(check);

        }
        Pattern pattern=Pattern.compile("//d{1,2}|//d{0,1}//d1");
        for(int i=0;i<arr.length;i++){
            Matcher matcher=pattern.matcher(arr[i]);
            if(matcher.find()){
                check=true;
            }else{
                check=false;
            }
            System.out.println(check);
        }

        // Scanner sc=new Scanner(System.in);
       // Scanner sc1=new Scanner(System.in);
      //  String s="welcometojava";
//        String s1=sc.next();
//        System.out.println(s.compareTo(s1)>1);
//        Map<Character, Long> m = s.chars().mapToObj(a ->(char) a).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(m);
//        //int k=3;
//String arr[]=new String[s.length()-k+1];
//        for (int i = 0; i <s.length()-k+1; i++) {
//            arr[i]=s.substring(i,i+k);
//        }
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[0]);
//        System.out.println(arr[arr.length-1]);

//        String res=s.substring(0,1).toUpperCase()+s.substring(1,s.length());
//        System.out.println(res);
//     MageritaPizza pizza=new MageritaPizza();
//        System.out.println(pizza.price());
//        Pizza pizza1=new VegParadise(new PannerPizza(pizza));
//        System.out.println(pizza1.price());
    }
}

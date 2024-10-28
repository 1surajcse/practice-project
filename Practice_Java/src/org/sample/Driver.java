package org.sample;/*
 * @author -Suraj Tiwari
 */


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {


        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Geeks", "For"),
                Arrays.asList("GeeksForGeeks", "A computer portal"),
                Arrays.asList("Java", "Programming")
        );

        // Using Stream flatMap(Function mapper)
//        listOfLists.stream()
//                .flatMap(list -> list.stream())
//                .forEach(System.out::println);
        List<String>list=listOfLists.stream().flatMap(e->e.stream()).collect(Collectors.toList());
        System.out.println(list);
        list.stream().flatMap(s->s.chars().mapToObj(c->(char) c)).forEach(System.out::print);
        X x=(a)->System.out.println("Suraj: "+a);
        x.print(20);
        x.data();
        X.dataSp();
    }

    interface  X{
        void print(int a);
        default void data(){
            System.out.println("I am default");
        }
      static    void dataS(){
            System.out.println("I am Static");
        }
        private static    void dataSp(){
            System.out.println("I am private Static");
        }
    }

    public static  int convertInt(String s){

        boolean signedCheck=false;
        if(s.startsWith("-")){
            signedCheck=true;
            s=s.substring(1,s.length());

        }
        int result=0;
        int rem=0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                Character a = s.charAt(i);
                rem = rem + 1;
                int temp = a.charValue() - 48;
                result = result * 10 + temp;
            }else{
                throw  new RuntimeException("Not a valid String to parse");
            }

        }
        Integer ab=result;
        if(signedCheck){
            result=result*-1;
        }
        return  result;
    }
}

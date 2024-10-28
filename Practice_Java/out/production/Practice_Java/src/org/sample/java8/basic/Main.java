package org.sample.java8.basic;/*
 * @author -Suraj Tiwari
 */


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        //map
        List<String> ls = Arrays.asList("Banana","Apple","Grapes","Banana");
        ls=ls.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
        System.out.println(ls);

        //flatMap

        List<List<Integer>>lss=Arrays.asList(Arrays.asList(1,2,4),Arrays.asList(3,5,6));

        //reduce skip,limit

        Integer allItems = lss.stream().flatMap(n -> n.stream()
                        .peek(s -> System.out.println(s)))
                .limit(3)
                .skip(1)
                .reduce( (a, b) -> a + b).get();
                

        System.out.println("ds: "+allItems);

        //AllMatch- return true or false

        boolean allMatch=ls.stream().allMatch(n->n.length()==6);
        System.out.println(allMatch);

        //anyMatch

        boolean anyMatch=ls.stream().anyMatch(n->n.length()==6);
        System.out.println(anyMatch);

        //findFirst

        String findFirst=ls.stream().filter(n->n.length()==6).findFirst().get();
        System.out.println(findFirst);

        //findAny

        String findAny=ls.stream().filter(n->n.length()==6).findAny().get();
        System.out.println(findAny);

        //Max or min

       int min= lss.stream().flatMap(n->n.stream()).min(Integer::compareTo).get();


        System.out.println("min: "+min);
        //second max
        int max=lss.stream().flatMap(n->n.stream()).limit(5).max(Integer::compareTo).get();
        System.out.println("max: "+max);

        System.out.println("Sorted::"+lss.stream().flatMap(s->s.stream()).sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

       int secondMax= lss.stream().flatMap(s->s.stream()).sorted(Comparator.reverseOrder()).skip(1).limit(1).findFirst().get();

        System.out.println("second:"+secondMax);
        //converting list to Array

        Integer arr[]=lss.stream().flatMap(n->n.stream()).toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));

        //joining

       String res= ls.stream().collect(Collectors.joining(",","(",")"));
        System.out.println(res);

        //groupingBy

        Employee e1=new Employee(1,"Suraj",23,Arrays.asList("Home","Office"));
        Employee e2=new Employee(2,"Ram",23,Arrays.asList("Home","Perm"));
        Employee e3=new Employee(3,"Akhil",27,Arrays.asList("Home","Office"));


        List<Employee> employees=Arrays.asList(e1,e2,e3);

        Map<Integer, List<Employee>> groups = employees.stream().collect(Collectors.groupingBy(Employee::age));
        System.out.println(groups);

        //partitioningBy:

        /**
         * used for partition into two parts(true/false) based on some condition
         * :returns map<boolean,list<Objects>>
         */

        Map<Boolean, List<Integer>> part = lss.stream().flatMap(n -> n.stream()).collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(part);

        //Counting
        /**
         * it will give the count of elements present in the streams
         */

       long items= lss.stream().flatMap(n->n.stream()).collect(Collectors.counting());
        System.out.println(items);

        //summarizingInt
        /**
         * it generates summary statitics for collection based on integer
         * we can perform(count,sum,min,max,avg) operations
         */

        double avg=lss.stream().flatMap(n->n.stream()).collect(Collectors.summarizingInt(Integer::intValue)).getAverage();
        System.out.println("avg:"+avg);
        long maxInt=lss.stream().flatMap(n->n.stream()).collect(Collectors.summarizingInt(Integer::intValue)).getMax();
        System.out.println("maxInt:"+maxInt);
        long sum = lss.stream().flatMap(n -> n.stream()).collect(Collectors.summarizingInt(Integer::intValue)).getSum();
        System.out.println("sum:"+sum);


       //maping
        /**
         * maping is a function which applies map for each element in collection
         */

        List<Integer> lenList = ls.stream().collect(Collectors.mapping(String::length, Collectors.toList()));

        System.out.println(lenList);
        //groupingby with counting
        String s="Ramesss";
        Map<Character,Long>m=  s.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(m);

        //Reducing
        int sum1=lss.stream().flatMap(n->n.stream()).collect(Collectors.reducing(0,Integer::sum));
        System.out.println(sum1);
       //toMap
        LinkedHashMap<String, Integer> lmap = ls.stream().collect(Collectors.toMap(Function.identity(), String::length, (o, n) -> o, LinkedHashMap::new));
        System.out.println(lmap);
                        LinkedHashMap newLMap=employees.stream().collect(Collectors.toMap(Employee::id,Employee::name,(o,n)->o,LinkedHashMap::new));

        System.out.println("newmap:"+newLMap);
        //CollectingAndthen
        int size=ls.stream().collect(Collectors.collectingAndThen(Collectors.toSet(),Set::size));

        System.out.println(size);

        List emps= employees.stream().sorted(Comparator.comparing(Employee::age)).toList();
        System.out.println(emps);
    }
}

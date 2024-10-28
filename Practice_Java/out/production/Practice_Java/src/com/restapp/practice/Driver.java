package com.restapp.practice;/*
 * @author -Suraj Tiwari
 */

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {

        canConstruct("aab","baa");
        Map<Character, Long> map1 = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj".chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Character, Long> map2 = "bg".chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map1);
        System.out.println(map2);


        for (Map.Entry<Character, Long> ms:map2.entrySet()) {
            Character a = ms.getKey();
            if (map1.get(a) >= map2.get(a)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }


String s="Suraj";

//s=s.replace(" ","");
        String arr[]=s.split(" ");
        System.out.println( "arr: "+ Arrays.toString(arr));
       String s11= Arrays.stream(arr).filter(a->!a.equals("")).collect(Collectors.joining(" "));
        System.out.println( "arr: "+ s11);
s=s.toLowerCase();
        if(s.equals(" ")||s.equals("")){
            System.out.println("Palindrom");
        }
String result=s.replaceAll("[^A-Z0-9a-z]","");

int start=0;
int end=result.length()-1;
while(start<end){
    System.out.println(result.charAt(start)+":"+result.charAt(end));
    if(result.charAt(start)!=result.charAt(end)){
        System.out.println("not a palindrom");
}
    start++;
    end--;
}
        System.out.println("Palindrom");
//String result= Arrays.asList(s.split(" ")).reversed().stream().filter(e -> !e.equals("")).
//        collect(Collectors.joining(" "));

        System.out.println(result);

String s1="Hello Wyou" ;
List<String> suffices=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            suffices.add(s.substring(i));
        }
      System.out.println(suffices);
        Collections.sort(suffices);
        System.out.println(suffices);

        int min=Math.min(s.length(),s1.length());

        String LCP="";
        for (int i = 0; i <min ; i++) {
            if(s.charAt(i)==s1.charAt(i)){
                LCP=LCP+s.charAt(i);
            }
            else{
                break;
            }
        }
        System.out.println("LCP::"+LCP);
s=s.replace(" ",",");
System.out.println(s);
String arr1[]=s.split(",");
  Arrays.stream(arr).forEach(System.out::print);

StringBuilder sb=new StringBuilder();

        for ( int i =arr.length-1 ;i>=0; i--) {
            if(arr[i]==""){
                continue;
            }
            sb.append(arr[i]);
            sb.append(" ");
        }
       System.out.println(sb.toString().trim());
        StringBuilder sb1=new StringBuilder("Suraj hello");
        System.out.println(sb.reverse());

 //        Predicate<String> ptest=s->s.startsWith("A");
//        System.out.println(ptest.or(s-> s.length()==5).test("Smara"));
//
//        Function<String,Integer> ftest=s->s.length();
//
//        System.out.println(ftest.apply("Suraj"));
//
//        Consumer<String> cTest=s-> System.out.println("You have given: "+s);
//
//        cTest.accept("RamJane");
//
//        Supplier<String> stest= ()->"Ram";
//        System.out.println(stest.get());


       // int arr[]= {7,1,5,3,6,4};

//        int a=getMajority(arr);
//        System.out.println("Majority:"+a);

//        int b=removeDuplicates(arr);
//        System.out.println("length:"+b);

       // rotateArray(arr,2);





    }

    private static void rotateArray(int[] nums,int k) {
       //  int arr[]={1,2,3,4,5,6,7};
      //  5,6,7,4,3,2,1

        reverse(nums,0, nums.length-1);

        reverse(nums,0, k-1);
        reverse(nums,k, nums.length-1);


         Arrays.stream(nums).forEach(System.out::print);

    }

    private static void reverse(int[] nums, int i, int i1) {
        while (i<i1) {
        int temp = nums[i1];
        nums[i1] = nums[i];
        nums[i] = temp;
         i++;
         i1--;
    }
    }

    private static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (i < 2 || num > nums[i - 2]) {
                nums[i++] = num;
            }
        }
        return i;
    }

    private static int getMajority(int[] arr) {

        Map<Integer, Long> hmap = Arrays.stream(arr).mapToObj(i->i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(hmap);
        Optional<Map.Entry<Integer, Long>> smap = hmap.entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println(smap.get().getKey());
        return Integer.valueOf(Math.toIntExact(smap.get().getKey()));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];

        for (char c : magazine.toCharArray())
           // System.out.println(c - 'a');
            alphabets_counter[c - 'a']++;

        for (char c : ransomNote.toCharArray()) {
            System.out.println(c - 'a');
            if (alphabets_counter[c - 'a'] == 0) return false;
            alphabets_counter[c - 'a']--;
        }
        return true;

}
}

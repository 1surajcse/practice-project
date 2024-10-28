package org.sample;/*
 * @author -Suraj Tiwari
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static volatile int check = 1;

    public static void main(String[] args) {



        String s="a";
        int len=s.length();
        int n=10000000;

        int repeat=n/len;
        int subs=n-repeat*len;

        String result=s.repeat(repeat)+s.substring(0,subs);

        long times=result.chars().mapToObj(a->(char)a).filter(a->a.equals('a')).count();
        System.out.println(times);
int hieght=0;

        for (int i = 0; i <=4 ; i++) {

            if(i%2==0){
                hieght=hieght+1;
            }
            else{
                hieght=hieght*2;
            }


        }
        System.out.println("Height:"+(Math.pow(4+1,2)-1));



    Driver.X.dataS();

//        AtomicInteger integer=new AtomicInteger(1);
//
//        integer.compareAndExchangeAcquire(1,2);
//        System.out.println(integer.get());
//
//        Runnable r=() -> {
//            integer.addAndGet(2);
//            System.out.println(integer);
//           check=check+1;
//            System.out.println("val: "+Thread.currentThread().getName()+check);
//        };
//        Thread t=new Thread(r);
//        Thread t1=new Thread(r);
//        t.start();
        //     t1.start();

        System.out.println("------------");
        String stringBuilder = new String("abc");

       // ModifyStBuider(stringBuilder);
        System.out.println(stringBuilder);

        List<String> list=new ArrayList<>();
        list.add("S");
        list.add("D");
        list.add("A");

        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()) {
            String name=iterator.next();
            if (name.equals("S")) {
                iterator.remove();
            }

        }
        System.out.println(list);

        String str ="tomato 11 30 1 4";

        String temp="0";
        int sum=0;

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                temp=temp+str.charAt(i);
            }
            else{
                sum=sum+Integer.parseInt(temp);
                temp="0";
            }
        }
        System.out.println(sum+Integer.parseInt(temp));





        List<String>stringList=new ArrayList<>();
        stringList.add("Ram");
        stringList.add("Shyam");
        stringList.add("Hira");
        stringList.add("John");
        stringList.add("John");
        stringList.add("Hira");


        int row = 10;
        int column = 5;
        int gen1[][] = new int[row][column];
        int gen2[][] = new int[row][column];
        int gen3[][] = new int[row][column];
        gen1[2][2] = 1;
        gen1[3][2] = 1;
        gen1[3][3] = 1;
        gen1[4][1] = 1;
        gen1[4][2] = 1;
        gen1[6][0] = 1;

        gameOfLife(gen1, gen2);
        System.out.println(".................");
        gameOfLife(gen2, gen3);


    }

    private static void gameOfLife(int[][] gen1, int[][] gen2) {
        for (int i = 0; i < gen1.length; i++) {
            for (int j = 0; j < gen1[0].length; j++) {
                if (gen1[i][j] == 1) {
                    // Any live cell with fewer than two live neighbours dies.
                    int count = liveConditionCheck(gen1, i, j);
                    if (count < 2) {
                        gen2[i][j] = 0;
                    }
                    //Any live cell with two or three live neighbours lives on to the next generation.
                    if (count == 2 || count == 3) {
                        gen2[i][j] = 1;

                    }
                    //      Any live cell with more than three live neighbours dies
                    if (count > 3) {
                        gen2[i][j] = 0;
                    }

                } else {
                    int zeroCount = liveConditionCheck(gen1, i, j);

                    if (zeroCount == 3) {
                        gen2[i][j] = 1;
                    }
                }
            }

        }

        for (int i = 0; i < gen2.length; i++) {
            for (int j = 0; j < gen2[0].length; j++) {
                System.out.print(gen2[i][j] + " ");
            }
            System.out.println();

        }
    }

    private static int liveConditionCheck(int[][] gen1, int i, int j) {
        int count = 0;

        if (basicCheckCondition(i, j + 1) && gen1[i][j + 1] == 1) {
            count++;
        }
        if (basicCheckCondition(i, j - 1) && gen1[i][j - 1] == 1) {
            count++;
        }
        if (basicCheckCondition(i - 1, j + 1)) {
            if (gen1[i - 1][j + 1] == 1) {
                count++;
            }
        }
        if (basicCheckCondition(i - 1, j - 1) && gen1[i - 1][j - 1] == 1) {
            count++;
        }
        if (basicCheckCondition(i + 1, j + 1) && gen1[i + 1][j + 1] == 1) {
            count++;
        }

        if (basicCheckCondition(i + 1, j - 1) && gen1[i + 1][j - 1] == 1) {
            count++;
        }
        if (basicCheckCondition(i - 1, j) && gen1[i - 1][j] == 1) {
            count++;
        }
        if (basicCheckCondition(i + 1, j) && gen1[i + 1][j] == 1) {
            count++;
        }
        return count;

    }


    public static boolean basicCheckCondition(int i, int j) {
        if (j >= 5 || j < 0 || i >= 10 || i < 0) {
            return false;
        }
        return true;
    }

    private static void ModifyStBuider(String stringBuilder) {
        stringBuilder="qwe";
        stringBuilder=new String("sxy");
        stringBuilder="123";
    }

    public List<String>getUniqueList(List<String> ls){

        List<String>resultLs= ls.stream().distinct().collect(Collectors.toList());

        return resultLs;

    }



}

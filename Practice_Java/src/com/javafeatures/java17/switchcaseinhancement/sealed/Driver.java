package com.javafeatures.java17.switchcaseinhancement.sealed;/*
 * @author -Suraj Tiwari
 */

public final class Driver implements  Sample {
    public static void main(String[] args) {
switchCaseBeforeJava17("A");
        switchCaseAfterJava17("B");
    }

    public static  void switchCaseBeforeJava17(String o){

        switch (o){
            case  "A":
                System.out.println(" A object:");
                break;
            case "B" :
                System.out.println("  B object:");
                break;
            default:
                System.out.println("default case");
        }

    }

    public static  void switchCaseAfterJava17(String o) {

        switch (o) {
            case "A" -> System.out.println("String A object:");

            case "B" -> System.out.println("Integer  B object:");
        default -> System.out.println("default case");
    }
        }


    @Override
    public void drive() {
        System.out.println("Hi There");
    }


}

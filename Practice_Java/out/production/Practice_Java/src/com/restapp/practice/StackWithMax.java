package com.restapp.practice;/*
 * @author -Suraj Tiwari
 */

import java.util.Stack;

public class StackWithMax {

    Stack<Integer> mainStack = new Stack<>();

    Stack<Integer> trackStack = new Stack<>();

    public static void main(String[] args) {
        StackWithMax stackWithMax=new StackWithMax();
        stackWithMax.push(4);
        stackWithMax.push(3);
        stackWithMax.push(18);
        stackWithMax.push(7);
        System.out.println(stackWithMax.mainStack);
        System.out.println(stackWithMax.trackStack);
    }

    public void push(int x) {
        mainStack.push(x);
        if (mainStack.size()== 1) {
            System.out.println("ins");
            trackStack.push(x);
            return;
        }
        if (x > trackStack.peek()) {
            trackStack.push(x);
        } else {
            trackStack.push(trackStack.peek());
        }
    }

    public void pop() {
        trackStack.pop();
        mainStack.pop();
    }
}



package com.restapp.practice;/*
 * @author -Suraj Tiwari
 */

import java.util.Stack;

public class BalanceParetheses {
    public static void main(String[] args) {

//String s="[()]{}{[()()]()}";
// String s="[(])";
// String s="([{}])";
        String s = "{}[]";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
//First push all the open brackets
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            //In else condition We need check stack top  contains the opening bracket respective to
            // current closing bracket  if yes then pop
            else {
                if (s.charAt(i) == '}' && stack.peek() == '{') {
                    stack.pop();
                }
                if (s.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();
                }
                if (s.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();
                }
            }


        }

        if (stack.empty()) {
            System.out.println("Balance");
        } else {
            System.out.println("Not Balance");
        }
    }
}

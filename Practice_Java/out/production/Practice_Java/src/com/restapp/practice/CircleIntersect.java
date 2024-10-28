package com.restapp.practice;/*
 * @author -Suraj Tiwari
 */

import java.util.Stack;

public class CircleIntersect {
    public static void main(String[] args) {
        String path = "/home/";
        if (path.endsWith("/")) {
            path = path.substring(0, path.length() - 1);
        }
        int index = path.lastIndexOf("../");
        System.out.println(index);
        path = path.substring(index);
        path = path.replace("//", "/");
        path = path.replace(".", "");
        System.out.println(path);


        String ab = "{[]}";
        boolean check1 = isValidUsingStack(ab);
        System.out.println(check1);


        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i);
        }


        int x1 = -10, y1 = 8;
        int x2 = 14, y2 = -24;
        int r1 = 30, r2 = 10;
        double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        if (d <= (r1 - r2)) {
            System.out.println("Circle B inside Circle A");
        } else if (d <= (r2 - r1)) {
            System.out.println("Circle A inside Circle B");
        } else if (d < (r1 + r2)) {
            System.out.println("Circle A intersect Circle B");
        } else if (d == (r1 + r2)) {
            System.out.println("Circle A and B are in touch with each other.");
        } else {
            System.out.println("Do not intesect");
        }
    }

    public static boolean isValidUsingStack(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(')');
            } else if (s.charAt(i) == '{') {
                stack.push('}');
            } else if (s.charAt(i) == '[') {
                stack.push(']');
            } else if (stack.empty() || stack.pop() != s.charAt(i)) {
                return false;
            }

        }
        return stack.empty();

    }

    @Override
    public String toString() {
        return super.toString();
    }
}

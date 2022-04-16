package com.java.class13;

import java.util.*;

public class StringConcatination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "Hello";
        String str2 = "DevX";
        int a = 10;
        int b = 20;
        int c = 5;

        System.out.println("Add: " + a + b);
        System.out.println("Add: " + a + b + c);
        System.out.println("Add: " + a + b * c);
        System.out.println(a + b + "Add");
        System.out.println(a + b + "Add" + a + b);
       // System.out.println(a + b + "Add" + b - c);
    }
}

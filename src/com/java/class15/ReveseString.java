package com.java.class15;

import java.util.*;

public class ReveseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String hold = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            hold = hold + name.charAt(i);
        }

        System.out.println("Reversed: " + hold);


    }
}
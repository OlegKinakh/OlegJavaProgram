package com.java.class08;

import java.util.*;

public class MaximumOutThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");

        int num1 = sc.nextInt();
        System.out.println("Enter second number ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number ");
        int num3 = sc.nextInt();


        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the biggest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the biggest");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is the biggest");
        } else if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " are equal");

        } else if (num1 == num3) {
            System.out.println(num1 + " and " + num3 + " are equal");

        } else if (num2 == num1) {
            System.out.println(num2 + " and " + num1 + " are equal");

        } else if (num2 == num3) {
            System.out.println(num2 + " and " + num3 + " are equal");
        } else if (num3 == num1) {
            System.out.println(num3 + " and " + num1 + " are equal");
        } else if (num3 == num2) {
            System.out.println(num3 + " and " + num2 + " are equal");
        }

    }
}

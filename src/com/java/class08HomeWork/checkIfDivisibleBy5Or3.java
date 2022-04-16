package com.java.class08HomeWork;

import java.util.*;

public class checkIfDivisibleBy5Or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check if divisible by 5 or 3");

        int num = sc.nextInt();

        if(num % 3 == 0 || num % 5 == 0 ){
            System.out.println(num + " is divisible by 3 or 5");
        }else{
            System.out.println(num + " is not divisible by 3 or 5");
        }


    }
}

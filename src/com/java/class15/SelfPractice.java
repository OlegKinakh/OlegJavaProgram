package com.java.class15;

import java.util.Scanner;

public class SelfPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num to multiply");

        int num = sc.nextInt();
        System.out.println("How many times");
        int times = sc.nextInt();
        for(int i = 1; i < times; i++){
           num = i*num;
        }


        System.out.println(num);






    }
}

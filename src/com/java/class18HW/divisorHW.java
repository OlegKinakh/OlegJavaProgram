package com.java.class18HW;

import java.util.Scanner;

/*   1. Write a program to print all numbers from 1 to 50 which has more than 5 divisor
     2. Write a program to print all even numbers which are divisible by 6 from 1 to 50*/
public class divisorHW {
    public static void main(String[] args) {
        divisor();
        getLine();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose limit");
        getLine();
        divisibleBy6(sc.nextInt());
    }

    static void divisor() {
        for (int i = 1; i <= 50; i++) {
            int hold = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    hold++;
                }
            }
            if (hold > 5) {
                System.out.println(i + " divisor");
            }
        }

    }
    static void divisibleBy6(int limit) {

        for (int i = 1; i <= limit; i++) {
            if (i % 6 == 0) {
                System.out.println(i + " is divisible by 6");

            }

        }
    }
    static void getLine(){
        System.out.println("==========");
    }
}

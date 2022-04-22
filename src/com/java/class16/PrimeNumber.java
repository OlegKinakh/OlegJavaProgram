package com.java.class16;

import java.util.Scanner;

/*Write a program to check given number is prime or not*/
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int hold;
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("is prime");
        } else {
            System.out.println("not prime");
        }


    }

}

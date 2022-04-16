package com.java.class11;

import java.util.Scanner;

public class class11HW {
    /*   ============= Homework =======================
   1. Write a program to print table of given number. If user enters 3 then print table of 3 like below
   3 6 9 12 15 18 21 24 27 30
  */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Enter num to display");
        int temp = sc.nextInt();
        int multOf10 = 10;
        int temp2 = temp * 10;
        if (temp <= temp2) {
            while (i <= multOf10) {
                System.out.println(temp * i);
                i++;
            }
        }


    }


}

package com.java.class16;
/*Write a program to print multiplication of 1to5*/
public class PrintMultOf1to5 {
    public static void main(String[] args) {
        int sum = 1;

        for (int i = 1; i <= 5 ; i++) {
            sum = sum * i;
            System.out.println(i);
        }
        System.out.println(sum);

    }
}

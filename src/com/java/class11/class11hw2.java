package com.java.class11;
/*2. Write a program to print numbers that are divisible by 3 and 5 from 1 to 50*/

public class class11hw2 {
    public static void main(String[] args) {
        int i = 1;
        int b = 1;
        while (i <= 50) {
            if (i % 3 == 0) {
                System.out.println("Divisible by 3: " + i);

            }
            i++;
        }
        System.out.println("=========================");
        while (b <= 50) {
            if (b % 5 == 0) {
                System.out.println("Divisible by 5: " + b);

            }
            b++;
        }

    }
}

package com.java.class11;

import java.util.Scanner;

public class BrainstormingWhileExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to print : ");

             int s = sc.nextInt();
        s = s * 6;
        int i = 6;

        while (i <= s) {
            System.out.println(i);
            i = i + 6;
        }
    }
}

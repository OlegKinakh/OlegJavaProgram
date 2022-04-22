package com.java.class16;

import java.util.Scanner;

//Write a program to take one String from user and print occurance of given char in string
public class FindOccuranceOfChar {
    public static void main(String[] args) {
        System.out.println("Enter word to check for given letter");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println("What letter are we looking for");
        char letter = sc.next().charAt(0);
        letter = Character.toLowerCase(letter);

        int num = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.toLowerCase().charAt(i) == letter) {
                num++;
            }
        }
        System.out.println(num);

    }
}

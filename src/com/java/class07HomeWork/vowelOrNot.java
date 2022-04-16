package com.java.class07HomeWork;


import java.util.Scanner;

public class vowelOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter to check if Vowel : ");
        char character = sc.next().toUpperCase().charAt(0);

        switch(character) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(character + " is a Vowel");
                break;
            default:
                System.out.println(character + " is not a Vowel");
        }

    }
}

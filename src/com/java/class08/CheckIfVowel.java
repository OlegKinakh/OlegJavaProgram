package com.java.class08;

import java.util.Scanner;

public class CheckIfVowel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter to check if Vowel : ");
        char character = sc.next().charAt(0);

        if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ){
            System.out.println(character + " is a Vowel");
        }else{
            System.out.println("Not a Vowel");
        }
    }
}

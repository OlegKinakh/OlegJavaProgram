package com.java.class16;
//Write a program to take 1 string from user and find out number of words we have inside string
import java.util.*;
public class StringPracticeWordCount {
    public static void main(String[] args) {

        System.out.println("Enter Statement");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String[] new1 = str1.split(" ");
        System.out.println(new1.length);
    }
}

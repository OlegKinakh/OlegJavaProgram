package com.java.class16;
import java.util.*;
public class StringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hold = "";
        System.out.println("enter word to reverse");
        String str1 = sc.nextLine();

        for(int i = str1.length()-1; i>=0;i--){
            hold = hold + str1.charAt(i);
        }
        System.out.println(hold);
    }
}

package com.java.class18;



import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next().toLowerCase();

        if(isPalindrome(name)){
            System.out.println("Is palindrome");
        }else{
            System.out.println("Not palindrome");
        };
    }


    static boolean isPalindrome(String s){
        s = s.toLowerCase();
        String rev = "";
        boolean isP = true;
        for(int i=s.length()-1; i>=0; i--){

            rev += s.charAt(i);
        }
        if(!s.equals(rev)){
            isP = false;
        }

        return isP;
    }
}

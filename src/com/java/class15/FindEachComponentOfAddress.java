package com.java.class15;
//Write a program to write each component of String into seperate line
public class FindEachComponentOfAddress {
    public static void main(String[] args) {
        String address = "B604, Cosmos Society, Magarpatta City, Pune, 411013";

        String[] words = address.split(", ");

        for(int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

       /* for(String s : words){
);
            System.out.println(s);
        }*/
    }
}

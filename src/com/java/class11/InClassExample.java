package com.java.class11;

import java.util.Scanner;

public class InClassExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int user = sc.nextInt();

        while(i <= user){
           if(i % 3 == 0){
               System.out.println("*");
           }else{
               System.out.println(i);
           }
        i++;

        }




    }
}

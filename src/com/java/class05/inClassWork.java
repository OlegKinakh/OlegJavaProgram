package com.java.class05;

import java.util.Scanner;

public class inClassWork {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number - ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Even");
        }else if(num % 2 == 1){
            System.out.println("Odd");
        }


    }
}

package com.java.class05;

import java.util.Scanner;

public class scannerClassExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    /*
        System.out.println("Enter the first Number - ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second Number - ");
        int num2 = sc.nextInt();

        System.out.println(num1 * num2);
        */

        int num = sc.nextInt();
        int num4= sc.nextInt();

        if(num>num4){
            System.out.println(num + " is greater");
        }else if (num4>num){
            System.out.println(num4 + " is greater");
        }else if (num4==num){
            System.out.println(num4 + " and " + num + " are equal");
        }




    }
}

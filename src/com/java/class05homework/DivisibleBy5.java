package com.java.class05homework;
import java.util.*;
public class DivisibleBy5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check - ");

        int num = sc.nextInt();

        if(num % 5 == 0){
            System.out.println(num + " is divisible by 5");
        }else{
            System.out.println(num + " is not divisible by 5");
        }









    }
}

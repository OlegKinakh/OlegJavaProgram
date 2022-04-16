package com.java.class06;
import java.util.*;
public class BloodDonationExample {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your age - ");
    int age = sc.nextInt();

    System.out.println("Enter your weight -");
    int weight = sc.nextInt();


    if(age >= 18 && weight >= 50){
        System.out.println("You're elegible");
    }else if(age >=18 && weight <=50){
        System.out.println("Your're underweight");
    }else if(age <=18 && weight >= 50){
        System.out.println("You are not of age limit");
    }else{
        System.out.println("You're totally not elegible");
    }





    }
}

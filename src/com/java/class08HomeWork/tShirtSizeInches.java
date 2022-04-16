package com.java.class08HomeWork;
import java.util.*;
public class tShirtSizeInches {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter T-Shirt size (inches) - ");

        int inches = sc.nextInt();

        if(inches >=27 && inches<=30){
            System.out.println("XS");
        }else if(inches >=31 && inches <= 34){
            System.out.println("S");
        }else if(inches >=35 && inches <= 38){
            System.out.println("L");
        }else if(inches >=39 && inches <= 42){
            System.out.println("XL");
        }else if(inches >=45 && inches <= 50){
            System.out.println("XXL");
        }else{
            System.out.println("Stay in a range of 27-50");
        }




    }

}

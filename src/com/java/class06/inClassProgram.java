package com.java.class06;
import java.util.*;
public class inClassProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number - ");



        int num = sc.nextInt();



        if(num < 0){
                System.out.println(num + " is negative");
        }else if(num >0){
                System.out.println(num + " is positive");
        }else {
            System.out.println("It's a zero");
        }



    }
}

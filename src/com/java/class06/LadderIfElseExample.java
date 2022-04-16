package com.java.class06;
import java.util.*;
public class LadderIfElseExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the day - ");

        int day = sc.nextInt();

        if(day == 0){
            System.out.println("Sun");
        }else if(day == 1){
            System.out.println("Mon");
        }else if(day == 2){
            System.out.println("Tues");
        }else if(day == 3){
            System.out.println("Wed");
        }else if(day == 4){
            System.out.println("Thur");
        }else if(day == 5){
            System.out.println("Friday");
        }else if(day == 6){
            System.out.println("Sat");
        }else{
            System.out.println("Unknown");
        }




    }
}

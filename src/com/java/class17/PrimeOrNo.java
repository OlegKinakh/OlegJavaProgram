package com.java.class17;
import java.util.*;
public class PrimeOrNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <=num ; i++) {
                if(num % i == 0){
                    System.out.println(i);
                    count++;
                }

        }
        if(count == 2){
            System.out.println("Is prime");
        }else{
            System.out.println("Not prime");
        }



    }
}

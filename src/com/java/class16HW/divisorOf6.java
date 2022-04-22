package com.java.class16HW;

import java.util.*;

public class divisorOf6 {
    public static void main(String[] args) {
        //Divisor of given number

   Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();


        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                System.out.println(i);
            }
        }
        System.out.println("---------------");
        //Sum of 1 + 2 – 3+ 4 + 5 – 6 + 7 + 8 – 9 +10
        int sum = 0;
        int hold = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                sum = -i;
            } else {
                sum = i;
            }

            hold = hold+sum;
        }
        System.out.println(sum);




    }

}

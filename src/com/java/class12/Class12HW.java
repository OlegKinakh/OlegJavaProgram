package com.java.class12;
import java.util.*;
//Find out result of below series
// 1*2*3*4*5
public class Class12HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Factorial of : ");
        double num = sc.nextDouble();
        int sum = 1;
        for (int i = 1; i <= num; i++) {

            sum *= i;

        }
        System.out.println(sum);
    }


}

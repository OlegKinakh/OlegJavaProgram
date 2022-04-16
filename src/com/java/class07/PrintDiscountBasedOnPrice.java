package com.java.class07;

import java.util.Scanner;

public class PrintDiscountBasedOnPrice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Price");
        int price = sc.nextInt();

        if (price < 100) {
            System.out.println("No Discount");
        } else if (price < 500) {
            System.out.println("Discount 5%");
        } else if (price < 1000) {
            System.out.println("Discount 10%");
        } else if (price >= 1000) {
            System.out.println("Discount 15%");
        } else {
            System.out.println("Invalid Price");
        }
}
}

package com.java.class17;


import java.util.Scanner;

//Print all prime numbers from 1 to 50
public class PrintPrimeNumberFrom1To50 {

    static void printPrime(int limit) {

        for (int i = 1; i <= limit; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {

                System.out.println(i + " is prime");

            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num to test");
        int num = sc.nextInt();
        printPrime(num);


    }

}

/*
******************************** Chicag Way ********************************
public class PrintPrimeNumberFrom1to50 {
    public static void main(String[] args) {
        for(int i=1; i<=50; i++){
            if(isPrime(i)==true) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int num){
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
}*/

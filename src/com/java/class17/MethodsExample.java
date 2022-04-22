package com.java.class17;


import java.util.Scanner;

public class MethodsExample {

    static void printLine(int length, char c){
        for (int i = 0; i <=length ; i++) {
            System.out.print(c);
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printLine(30,'-');
        System.out.println("Enter first number");
        printLine(30,'=');
        int a = sc.nextInt();
        printLine(30,'*');
        System.out.println("Enter second number");
        int b = sc.nextInt();
        printLine(30,'^');

        System.out.println("Operator (Add/Div/Sub/Mul)");
        printLine(30,'`');
        String operation = sc.next();

        switch(operation.toLowerCase()){
            case "add":
                System.out.println(a+b);
                break;
            case "sub":
                System.out.println(a-b);
                break;
            case "mul":
                System.out.println(a*b);
                break;
            case "div":
                System.out.println(a/b);
            default:
                System.out.println("Invalid input ");
        }



    }


}

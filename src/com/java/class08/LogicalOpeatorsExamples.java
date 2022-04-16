package com.java.class08;

public class LogicalOpeatorsExamples {

    public static void main(String[] args) {

        boolean b1 = true, b2=false, b3=true;

        System.out.println(b1 || b2);  //T
        System.out.println(b1 && b2); //F
        System.out.println(!b1 || !b2); //T
        System.out.println(b2 || b1 && b3 ); //T
        System.out.println(b3 || b1 && b2); //T

        System.out.println(b1 && b3 && b2 || b2 || b3 && b1 && b2 || b1); //T

        System.out.println(b1 && b2 || b2 && b3 || b1 && !b3); //T


    }
}

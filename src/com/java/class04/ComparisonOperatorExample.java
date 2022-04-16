package com.java.class04;

public class ComparisonOperatorExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        int c = 10;
        int d = 8;

        System.out.println(a == b); //false
        System.out.println(a < b); // true
        System.out.println(a > b);// false
        System.out.println(a < c );//false
        System.out.println(a >= c); // true
        System.out.println(a <= b); // true
        System.out.println(a <= c); // true
        System.out.println(a != b); //true
        System.out.println(b <= c);//false
        System.out.println(b >= d); //true
        System.out.println(a != c); //false

    }


}

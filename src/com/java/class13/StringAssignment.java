package com.java.class13;

import java.util.*;

//Create 3 string Variables -> initialize two variables
//with constant value
//take third variable value from user,
//Compare 1st and 2nd using == operator
//Compare 2nd and 3rd using == operator
//Compare 1st and 3rd using .equals method
public class StringAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String one = "Potato";
        String two = "Potato";
        String three = sc.nextLine();


        if (one == two) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (two == three) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (one.equals(three)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}

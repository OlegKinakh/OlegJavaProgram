package com.java.class07HomeWork;

import java.util.*;

public class CompanyName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Company Name: ");
        String name = sc.nextLine();

        if (name.equalsIgnoreCase("gmail")) {
            System.out.println(name + " was made by Google");
        } else if (name.equalsIgnoreCase("whatsapp")) {
            System.out.println(name + " was made by FaceBook(Meta)");
        } else if (name.equalsIgnoreCase("youtube")) {
            System.out.println(name + " was made by Google");
        } else if (name.equalsIgnoreCase("Skype")) {
            System.out.println(name + " was made by Microsoft Corp.");
        } else if (name.equalsIgnoreCase("Hangouts")) {
            System.out.println(name + " was made by Google");
        } else if (name.equalsIgnoreCase("Outlook")) {
            System.out.println(name + " was made by Microsoft");
        } else {
            System.out.println("Not found");
        }


    }
}

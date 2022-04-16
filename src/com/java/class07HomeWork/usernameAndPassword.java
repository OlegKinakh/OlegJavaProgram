package com.java.class07HomeWork;
import java.util.*;
public class usernameAndPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //The correct username is admin
        //The correct password is password123

        System.out.println("Enter your USERNAME: ");
        String username = sc.nextLine();

        System.out.println("Enter your PASSWORD: ");
        String password = sc.nextLine();

        if(username.equals("admin") && password.equals("password123")){
            System.out.println("Login Successful!");
        }else if(username.equals("admin")){
            System.out.println("Invalid Password");
        }else if(password.equals("password123")){
            System.out.println("Invalid Username");
        }else{
            System.out.println("Login Unsuccessful");
        }

    }
}

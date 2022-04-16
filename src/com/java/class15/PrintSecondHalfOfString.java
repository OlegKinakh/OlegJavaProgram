package com.java.class15;
import java.util.*;
public class PrintSecondHalfOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str = sc.nextLine();

        if(str.length() % 2 == 0){
            str = str.substring(str.length()/2);
        }else{
            str = str.substring((str.length()/2)+1);
        }

        System.out.println(str);


    }
}

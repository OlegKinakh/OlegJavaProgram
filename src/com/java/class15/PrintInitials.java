package com.java.class15;
import java.util.*;
public class PrintInitials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();

        String[] words = fullName.split(" ");
        for (String s : words) {
            System.out.print(Character.toUpperCase(s.charAt(0)) + ".");
        }



       /* String initials = words[0].substring(0,1)+"."+words[1].substring(0,1)+"."+words[2].substring(0,1);
        System.out.println("\n"+ initials.toUpperCase(Locale.ROOT));*/
        //Chirag Way:
       /* String[] parts = fullName.split(" ");

        String firstName = parts[0];
        String middleName = parts[1];
        String lastName = parts[2];

        System.out.println(firstName.charAt(0)+"."+ middleName.charAt(0)+"."+ lastName.charAt(0));
*/
    }
}




package com.java.class14;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello World";
        String str3 = "Hello World! Welcome to Devx!";
        // 1. We want to check the equality of two string
        System.out.println(".equals " + str1.equals(str2));
        System.out.println("====================================");
        // 2. Check equality of two String ignoring case
        System.out.println(".equalsIgnoreCase " + str1.equalsIgnoreCase(str2));
        System.out.println("====================================");
        // 3. Check one String contains another string
        System.out.println(".contains " + str3.contains(str1));
        String str3LowerCase = str3.toLowerCase(Locale.ROOT);
        String str2LowerCase = str2.toLowerCase(Locale.ROOT);
        System.out.println("3.1 Contains: " + str3LowerCase.contains(str2LowerCase));
        System.out.println("====================================");
        // 4. Changing the case of String
        System.out.println(".toUpperCase" + str3.toUpperCase());
        System.out.println(".toLowerCase" + str3.toLowerCase());
        str1 = "Hello World";
        System.out.println("====================================");
        // 5. Find index of character
        System.out.println("4. Index of Char: " + str1.indexOf('W'));
        System.out.println("4.1 Index of Char: " + str3.lastIndexOf('W'));
        System.out.println("====================================");
        // 6 Find character at index

        System.out.println("5. Index Of Char: " + str1.charAt(0));

        System.out.println("====================================");

        //7 Find length of String
        str1 = "Hello World";
        str3 = "Hello World! Welcome to Devx!";
        System.out.println("Length of String " + str1.length());
        System.out.println("Length of String " + str3.length());
        System.out.println("====================================");
        //8. Length of String
        str1 = "        ";
        str3 = "";
        System.out.println("is Empty"+str1.isEmpty());
        System.out.println("is Empty"+str3.isEmpty());
        //Blank
        System.out.println("Is blank "+str1.isBlank());
        System.out.println("Is blank "+str3.isBlank());
        System.out.println("====================================");
        //Replace
        //REGEX
        str1 = "Welcome 900 User";
        str3 = "Devx";
        System.out.println("============");
        System.out.println("Replace: " + str1.replaceAll("[A-Za-z]", ""));
        System.out.println("===========");
        System.out.println(str1.replace("User", str3));
        System.out.println("====================================");
        //10. Format
        str1 = "Welcome %s, Welcome to %s";
        System.out.println("Format :"+String.format(str1,"Oleg", "Ebay"));

        //11. SubString
        str1 = "Welcome to java class. Today is fun day!";

        System.out.println("Sub String: " + str1.substring(0,5));



        //12. Split
        str1 = "Welcome-to-java-class";
        String[] words = str1.split("-");
        System.out.println("12. Split: " + words[0] + words[1] +words[2] + words[3]);
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);
        //13. ReplaceAll



    }


}

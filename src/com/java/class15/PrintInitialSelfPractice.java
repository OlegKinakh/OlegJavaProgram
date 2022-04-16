package com.java.class15;

import java.util.*;

public class PrintInitialSelfPractice {
    public static void main(String[] args) {
        String name = "Oleg Bogdanovich Kinakh";

        String[] name1 = name.split(" ");

        System.out.println(name1[0].substring(0, 1)+ "." + name1[1].substring(0,1) + "." + name1[2].substring(0,1) + ".");


    }
}

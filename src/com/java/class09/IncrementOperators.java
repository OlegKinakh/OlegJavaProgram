package com.java.class09;

public class IncrementOperators {

    public static void main(String[] args) {

        int i = 3;

        int j = 7;


        int k = j++ + --i;                          //i - 3
        int m = i++ - --j;                          //j - 7
                                                    //m - -5
                                                    //k - 10

        System.out.println(i);

        System.out.println(j);
        System.out.println(m);
        System.out.println(k);





        /*int i = 7;
        i--; //6
        i++;//7
        System.out.println(i);//7*/


        /*   int i = 7;
        i--;    //6
        i--;    //5
        i++;    //6
        System.out.println(i);  //6*/


    }
}

package com.java.class09HomeWork;

public class PostFixPreFixOperators {
    public static void main(String[] args) {


        int i = 4, j = 4, k = 4;
        i=j++;
        j=k++;
        k=--i;
        int m = i + j + k--;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
        //i - 3
        //j - 4
        //k - 2
        //m - 10













        /*  int i = 4, j = 4, k = 4;
        i = j++ + --k;
        int m = i + j + k;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
        //i - 4  4  7 Answer: 7
        //j - 4  4  5 Answer: 5
        //k - 4  3  3 Answer: 3
        //m - 0  0  0 Answer: 15*/




        /*   int i = 4, j = 4, k = 4;

        int m = ++i + ++j + --k;

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
        //i- Answer:5
        //j- Answer:5
        //k- Answer:3
        //m- Answer:13*/







        /*  int i = 4, j = 4, k = 4;

        int m = i++ + j-- + --k;

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
        //i-4 - 4 - 4  - Answer: 5
        //j-4 - 4 - 4  - Answer: 3
        //k-4 - 3 - 3  - Answer: 3
        //m-0 - 0 - 11 - Answer: 11*/
    }
}

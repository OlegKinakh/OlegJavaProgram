package com.java.class18HW;
/*   1. Write a program to print all numbers from 1 to 50 which has more than 5 divisor
     2. Write a program to print all even numbers which are divisible by 6 from 1 to 50*/
public class hw {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            moreThanFive(i);
        }
    }


    public static void moreThanFive(int hold ){
        int count =0;
        for (int i = 1; i <=50; i++) {
            if(hold % i == 0){
                count++;
            }
        }

        if(count>5){
            System.out.println(hold);
        }


    }


}

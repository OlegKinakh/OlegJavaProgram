package com.java.class17;

public class MethodExample2 {
    static boolean isEven(int num){
        return num % 2 == 0;
    }


    public static void main(String[] args) {
        for (int i = 1; i <=15 ; i++) {
            if(isEven(i)){
                System.out.println(i + " is even");
            }else{
                System.out.println(i + " is Odd");
            }
        }





    }
}

package com.java.class04;

public class ExpressionExample {

    public static void main(String[] args) {
      /*
      If we do addition with String it'll be concatenation
      String + String = StringString
      String + Int = StringInt
      Int + String = IntString(concatenation)
      Int+Int = (addition)
       */

        int a = 10, b =20, c = 30;

      String str1 = "Hello";
      String str2 = " Java";

        System.out.println(a);//10
        System.out.println(a+b); //30
        System.out.println(str1 +  str2);//Hello Java
        System.out.println(str1 + a + b); //Hello1020
        System.out.println(a + b + str1); //30Hello
        System.out.println("a + b");//a + b
        System.out.println("a" + b + c); // a2030
        System.out.println(str1 + a *b);//Hello200
        //System.out.println(str1 + a - b); Error

        System.out.println(a - b + str1);


    }
}

package com.java.class07;
import java.util.*;
public class SwitchStatement {

    public static void main(String[] args) {
        System.out.println("Enter a num: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //double float and boolean is not supported for switch statements
      switch(num){
          case 0:
              System.out.println("Zero");
                break;
          case 1:
              System.out.println("One");
              break;
          case 2:
              System.out.println("two");
              break;
          case 3:
              System.out.println("three");
              break;
          case 4:
              System.out.println("four");
              break;
          case 5:
              System.out.println("five");
              break;
          default:
              System.out.println("out of index");
      }



    }
}

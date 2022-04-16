package com.java.class07;



import java.util.Scanner;

public class PrintNumberOfDaysInMonthUsingSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a month name");

        String month = sc.nextLine();

        switch(month) {
            case "January":
                System.out.println("31 Days in January");
                break;
            case "February":
                System.out.println(" 28 days in a common year and 29 days in leap years");
                break;
            case "March":
                System.out.println("31 days in March");
                break;
            case "April":
                System.out.println("30 days in April");
                break;
            case "May":
                System.out.println("31 days in May");
                break;
            case "June":
                System.out.println("30 days in June");
                break;
            case "July":
                System.out.println("31 days in July");
                break;
            case "August":
                System.out.println("31 days in August");
                break;
            case "September":
                System.out.println("30 days in September");
                break;
            case "October":
                System.out.println("31 days in October");
                break;
            case "November":
                System.out.println("30 days in November");
                break;
            case "December":
                System.out.println("31 days in December");
                break;
            default:
                System.out.println("Enter a Valid Month");
        }



    }


}

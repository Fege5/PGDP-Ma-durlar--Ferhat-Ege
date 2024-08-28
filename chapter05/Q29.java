package odevler.chapter05;

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year: ");
        int firstDay = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int daysInMonth;
        String monthName;

        for (int month = 1; month <= 12; month++) {
            switch (month) {
                case 1:
                    monthName = "January";
                    daysInMonth = 31;
                    break;
                case 2:
                    monthName = "February";
                    daysInMonth = isLeapYear ? 29 : 28;
                    break;
                case 3:
                    monthName = "March";
                    daysInMonth = 31;
                    break;
                case 4:
                    monthName = "April";
                    daysInMonth = 30;
                    break;
                case 5:
                    monthName = "May";
                    daysInMonth = 31;
                    break;
                case 6:
                    monthName = "June";
                    daysInMonth = 30;
                    break;
                case 7:
                    monthName = "July";
                    daysInMonth = 31;
                    break;
                case 8:
                    monthName = "August";
                    daysInMonth = 31;
                    break;
                case 9:
                    monthName = "September";
                    daysInMonth = 30;
                    break;
                case 10:
                    monthName = "October";
                    daysInMonth = 31;
                    break;
                case 11:
                    monthName = "November";
                    daysInMonth = 30;
                    break;
                case 12:
                    monthName = "December";
                    daysInMonth = 31;
                    break;
                default:
                    monthName = "";
                    daysInMonth = 0;
            }

            System.out.println("          " + monthName + " " + year);
            System.out.println("-----------------------------------------");
            System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");

            for (int i = 0; i < firstDay; i++) {
                System.out.print("      ");
            }

            for (int day = 1; day <= daysInMonth; day++) {
                System.out.printf("%-6d", day);

                if ((firstDay + day) % 7 == 0) {
                    System.out.println();
                }
            }

            System.out.println();

            firstDay = (firstDay + daysInMonth) % 7;
        }
    }
}
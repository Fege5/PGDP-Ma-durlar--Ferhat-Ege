package ödevler.bölüm03;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a month and year as the given example : month 2 and year 2012");
        System.out.print("Month ");
        int month = input.nextInt();
        System.out.print("year ");
        int year = input.nextInt();
        int daysInMonth = 0;
        String monthInWriting = " ";

        boolean isLeapYear =
                (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month) {
            case 1:
                monthInWriting = "January";
                daysInMonth = 31;
                break;
            case 2:
                monthInWriting = "February";
                if (isLeapYear == false) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case 3:
                monthInWriting = "March";
                daysInMonth = 31;
                break;
            case 4:
                monthInWriting = "April";
                daysInMonth = 30;
                break;
            case 5:
                monthInWriting = "May";
                daysInMonth = 31;
                break;
            case 6:
                monthInWriting = "June";
                daysInMonth = 30;
                break;
            case 7:
                monthInWriting = "July";
                daysInMonth = 31;
                break;
            case 8:
                monthInWriting = "August";
                daysInMonth = 31;
                break;
            case 9:
                monthInWriting = "September";
                daysInMonth = 30;
                break;
            case 10:
                monthInWriting = "October";
                daysInMonth = 31;
                break;
            case 11:
                monthInWriting = "November";
                daysInMonth = 30;
                break;
            case 12:
                monthInWriting = "December";
                daysInMonth = 31;
                break;
        }

        System.out.println(monthInWriting + " " + year + " had " + daysInMonth + " days");

    }
}

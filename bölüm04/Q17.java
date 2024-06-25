package ödevler.bölüm04;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a month: ");
        String month = input.next();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int days = 0;
        switch (month) {
            case "Jan":
                days = 31;
                break;
            case "Feb":
                if (isLeapYear) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case "Mar":
                days = 31;
                break;
            case "Apr":
                days = 30;
                break;
            case "May":
                days = 31;
                break;
            case "Jun":
                days = 30;
                break;
            case "Jul":
                days = 31;
                break;
            case "Aug":
                days = 31;
                break;
            case "Sep":
                days = 30;
                break;
            case "Oct":
                days = 31;
                break;
            case "Nov":
                days = 30;
                break;
            case "Dec":
                days = 31;
                break;
        }
        System.out.println(month + " " + year + " has " + days + " days");
    }
}

package ödevler.bölüm03;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();

        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();

        System.out.print("Enter the day of the month: 1-31: ");
        int day = input.nextInt();

        if (month == 1 || month == 2) {
            month += 12;
            year -= 1;
        }

        int yearOfTheCentury = year % 100;
        int century = year / 100;
        String dayOfTheWeekInWriting = " ";

        int dayOfTheWeek = (day + ((26 * (month + 1)) / 10) + yearOfTheCentury + (yearOfTheCentury / 4) + (century / 4) + (5 * century)) % 7;
        switch (dayOfTheWeek) {
            case 0:
                dayOfTheWeekInWriting = "Saturday";
                break;
            case 1:
                dayOfTheWeekInWriting = "Sunday";
                break;
            case 2:
                dayOfTheWeekInWriting = "Monday";
                break;
            case 3:
                dayOfTheWeekInWriting = "Tuesday";
                break;
            case 4:
                dayOfTheWeekInWriting = "Wednesday";
                break;
            case 5:
                dayOfTheWeekInWriting = "Thursday";
                break;
            case 6:
                dayOfTheWeekInWriting = "Friday";
                break;
        }
        System.out.println("Day of the week is " + dayOfTheWeekInWriting);
    }
}

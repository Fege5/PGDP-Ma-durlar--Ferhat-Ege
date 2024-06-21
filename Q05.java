package ödevler.bölüm03;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int todaysDay = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int daysElapsed = input.nextInt();

        String daysOfWeek = "Sunday";
        String future = "Sunday";
        int futureDay = (todaysDay + daysElapsed) % 7;

        switch (todaysDay) {

            case 1:
                daysOfWeek = "Monday";
                break;
            case 2:
                daysOfWeek = "Tuesday";
                break;
            case 3:
                daysOfWeek = "Wednesday";
                break;
            case 4:
                daysOfWeek = "Thursday";
                break;
            case 5:
                daysOfWeek = "Friday";
                break;
            case 6:
                daysOfWeek = "Saturday";
                break;

        }

        switch (futureDay) {
            case 1:
                future = "Monday";
                break;
            case 2:
                future = "Tuesday";
                break;
            case 3:
                future = "Wednesday";
                break;
            case 4:
                future = "Thursday";
                break;
            case 5:
                future = "Friday";
                break;
            case 6:
                future = "Saturday";
                break;
        }
        System.out.println("Today is " + daysOfWeek + " and the future day is " + future);

    }
}

package ödevler.bölüm02;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        double offset = input.nextDouble();
        double milliseconds = System.currentTimeMillis();
        double seconds = milliseconds / 1000;
        double minutes = seconds / 60;
        double hours = minutes / 60;
        double currentSecond = seconds % 60;
        double currentMinutes = minutes % 60;
        double currentHour = (hours + offset) % 24;
        System.out.println("The current time is " + (int) currentHour + ":" + (int) currentMinutes + ":" + (int) currentSecond);
    }
}

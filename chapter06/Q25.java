package odevler.chapter06;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of milliseconds: ");
        long amount = input.nextLong();

        String result = convertMillis(amount);
        System.out.println(result);
    }

    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;
        long seconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long minutes = totalMinutes % 60;
        long hours = totalMinutes / 60;

        return hours + ":" + minutes + ":" + seconds;
    }
}

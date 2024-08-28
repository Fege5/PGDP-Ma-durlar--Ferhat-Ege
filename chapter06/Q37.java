package odevler.chapter06;

import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("Enter the width: ");
        int width = input.nextInt();

        String formattedNumber = format(number, width);
        System.out.println("Formatted number: " + formattedNumber);

    }

    public static String format(int number, int width) {
        String numStr = Integer.toString(number);

        int zerosNeeded = width - numStr.length();

        for (int i = 0; i < zerosNeeded; i++) {
            numStr = "0" + numStr;
        }

        return numStr;
    }

}

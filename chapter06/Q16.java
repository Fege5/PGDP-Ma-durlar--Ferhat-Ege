package odevler.chapter06;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year interval: ");
        int year = input.nextInt();

        int value = numberOfDaysInAYear(year);
        System.out.println(value);
    }

    public static int numberOfDaysInAYear(int year) {
        int sum = year * 12 * 30;
        return sum;
    }

}

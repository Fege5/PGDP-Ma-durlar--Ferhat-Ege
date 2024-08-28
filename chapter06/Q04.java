package odevler.chapter06;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        reverse(number);
    }

    public static void reverse(int number) {
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }

        System.out.println("Reversed number is: " + reversedNumber);
    }
}

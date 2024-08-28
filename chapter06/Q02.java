package odevler.chapter06;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();

        int sumDigits = sumDigits(number);
        System.out.println("The sum of the digits is: " + sumDigits);
    }

    public static int sumDigits(long n) {
        int result = 0;

        while (n > 0) {
            result += n % 10;
            n = n / 10;
        }

        return result;
    }
}

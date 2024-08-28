package odevler.chapter05;

import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int firstNineDigits = input.nextInt();

        int tenthDigit = 0;
        int divisor = 1000000000;

        for (int i = 1; i <= 9; i++) {
            tenthDigit += (firstNineDigits % divisor) * i;
            divisor /= 10;
        }

        tenthDigit = tenthDigit % 11;

        int newNumber = (firstNineDigits * 10) + tenthDigit;
        System.out.println("The ISBN-10 number is " + newNumber);
    }
}
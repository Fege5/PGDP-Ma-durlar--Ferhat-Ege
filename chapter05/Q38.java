package odevler.chapter05;

import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal integer: ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("The octal value is 0");
            return;
        }

        String octal = "";

        while (number > 0) {
            int lastNumber = number % 8;
            octal = lastNumber + octal;
            number /= 8;
        }

        System.out.println("The octal value is " + octal);
    }
}

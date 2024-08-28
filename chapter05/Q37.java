package odevler.chapter05;

import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal integer: ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("The binary value is 0");
            return;
        }

        String binary = "";

        while (number > 0) {
            int lastNumber = number % 2;
            binary = binary + lastNumber;
            number /= 2;
        }

        System.out.println("The binary value is " + binary);
    }
}

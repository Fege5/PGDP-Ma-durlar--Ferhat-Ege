package odevler.chapter05;

import java.util.Scanner;

public class Q47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn = input.nextLine();

        int checksum = 0;

        if (isbn.length() != 12) {
            System.out.println(isbn + " is an invalid output");
            return;
        }

        for (int i = 0; i < isbn.length(); i++) {
            int digit = isbn.charAt(i) - '0';
            if (i % 2 == 0) {
                checksum += digit;
            } else {
                checksum += 3 * digit;
            }
        }

        checksum = 10 - (checksum % 10);
        if (checksum == 10) {
            checksum = 0;
        }

        System.out.println("The full ISBN-13 number is: " + isbn + checksum);
    }
} //chatgptden yardım aldım

package odevler.chapter06;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = input.nextLine();
        if (isValid(password)) {
            System.out.println("Your password is valid");
        } else {
            System.out.println("Your password is invalid");
        }
    }

    public static boolean isValid(String s) {
        if (s.length() < 8) {
            return false;
        }

        int digitCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        if (digitCount < 2) {
            return false;
        }

        return true;
    }
} //biraz yardım aldım

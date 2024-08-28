package odevler.chapter05;

import java.util.Scanner;

public class Q50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int uppercaseLetters = 0;

        System.out.print("Enter a String: ");
        String s = input.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                uppercaseLetters++;
            }
        }

        System.out.println("The number of uppercase letters is " + uppercaseLetters);
    }
}

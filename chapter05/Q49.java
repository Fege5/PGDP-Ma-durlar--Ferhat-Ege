package odevler.chapter05;

import java.util.Scanner;

public class Q49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vowels = 0;
        int consonants = 0;

        System.out.print("Enter a String: ");
        String s = input.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                    ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonants++;
            }
        }

        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);
    }
}
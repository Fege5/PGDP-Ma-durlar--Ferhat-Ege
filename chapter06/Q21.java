package odevler.chapter06;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                result += getNumber(Character.toUpperCase(ch));
            } else {
                result += ch;
            }
        }

        System.out.println(result);
    }

    public static int getNumber(char uppercaseLetter) {
        if (uppercaseLetter >= 'A' && uppercaseLetter <= 'C') {
            return 2;
        } else if (uppercaseLetter >= 'D' && uppercaseLetter <= 'F') {
            return 3;
        } else if (uppercaseLetter >= 'G' && uppercaseLetter <= 'I') {
            return 4;
        } else if (uppercaseLetter >= 'J' && uppercaseLetter <= 'L') {
            return 5;
        } else if (uppercaseLetter >= 'M' && uppercaseLetter <= 'O') {
            return 6;
        } else if (uppercaseLetter >= 'P' && uppercaseLetter <= 'S') {
            return 7;
        } else if (uppercaseLetter >= 'T' && uppercaseLetter <= 'V') {
            return 8;
        } else if (uppercaseLetter >= 'W' && uppercaseLetter <= 'Z') {
            return 9;
        } else {
            return -1;
        }
    }
} //chatgptden yardum aldım
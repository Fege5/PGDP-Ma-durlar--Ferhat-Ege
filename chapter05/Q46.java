package odevler.chapter05;

import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String reversedString = "";

        System.out.print("Enter a String: ");
        String s = input.nextLine();

        for (int i = s.length() - 1; i >= 0; i--) {
            reversedString += s.charAt(i);
        }

        System.out.println("The reversed String is: " + reversedString);
    }
}
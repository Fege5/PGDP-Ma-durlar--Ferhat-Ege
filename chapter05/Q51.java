package odevler.chapter05;

import java.util.Scanner;

public class Q51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        int minLength = Math.min(str1.length(), str2.length());
        String commonPrefix = "";

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                commonPrefix += str1.charAt(i);
            } else {
                break;
            }
        }

        if (commonPrefix.isEmpty()) {
            System.out.println(str1 + " and " + str2 + " have no common prefix.");
        } else {
            System.out.println("The common prefix is: " + commonPrefix);
        }
    }
} //chaptgptden yardım aldım
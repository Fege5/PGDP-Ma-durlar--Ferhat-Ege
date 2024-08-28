package odevler.chapter05;

import java.util.Scanner;

public class Q48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result += s.charAt(i);
            }
        }

        System.out.println(result);

    }
}

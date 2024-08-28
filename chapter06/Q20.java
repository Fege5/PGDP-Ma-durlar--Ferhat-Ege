package odevler.chapter06;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();
        int value1 = countLetters(s);
        System.out.println(value1);
    }

    public static int countLetters(String s) {
        int sum = s.length();
        return sum;
    }

}

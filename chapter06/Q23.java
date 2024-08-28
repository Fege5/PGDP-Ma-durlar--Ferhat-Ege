package odevler.chapter06;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.print("Enter a char: ");
        char c = input.next().charAt(0);

        int counter = count(s, c);
        System.out.println(counter);
    }

    public static int count(String str, char a) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }

        return count;
    }

}

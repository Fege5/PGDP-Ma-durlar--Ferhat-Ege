package ödevler.bölüm04;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);

        int unicode = (int) ch;

        System.out.println("The Unicode for the character " + ch + " is " + unicode);

    }
}
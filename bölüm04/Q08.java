package ödevler.bölüm04;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        int ascii = input.nextInt();

        char character = (char) ascii;
        System.out.println("The ASCII code is " + character);
    }
}

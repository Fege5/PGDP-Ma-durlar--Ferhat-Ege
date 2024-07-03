package odevler.chapter05;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int factor = 2;

        while (number > 1) {
            if (number % factor == 0) {
                System.out.println(factor + " ");
                number = number / factor;
            } else {
                factor++;
            }
        }
    }
}

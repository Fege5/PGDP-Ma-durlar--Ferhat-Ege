package odevler.chapter05;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        int gcd = 1;
        int d = n1;

        if (n2 < n1) {
            d = n2;
        } else {
            d = n1;
        }

        while (d >= 1) {
            if (n1 % d == 0 && n2 % d == 0) {
                gcd = d;
                break;
            }
            d--;
        }


        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
}

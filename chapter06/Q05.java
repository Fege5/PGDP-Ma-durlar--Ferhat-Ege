package odevler.chapter06;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();

        displaySortedNumbers(a, b, c);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double max;
        double max2;
        double min;

        if (num1 <= num2 && num1 <= num3) {
            min = num1;
            if (num2 <= num3) {
                max2 = num2;
                max = num3;
            } else {
                max2 = num3;
                max = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            min = num2;
            if (num1 <= num3) {
                max2 = num1;
                max = num3;
            } else {
                max2 = num3;
                max = num1;
            }
        } else {
            min = num3;
            if (num1 <= num2) {
                max2 = num1;
                max = num2;
            } else {
                max2 = num2;
                max = num1;
            }
        }
        System.out.println(min + " " + max2 + " " + max);
    }
}


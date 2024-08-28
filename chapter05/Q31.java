package odevler.chapter05;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter annual percentage yield: ");
        double percentage = input.nextDouble();

        System.out.print("Enter maturity period (number of months): ");
        int months = input.nextInt();

        double CDValue = amount;

        System.out.println("Month          CD Value");

        for (int i = 0; i < months; i++) {
            CDValue = CDValue + CDValue * percentage / 1200;
            System.out.printf("%-14d%.2f%n", i, CDValue);
        }
    }
}

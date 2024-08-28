package odevler.chapter05;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualRate = input.nextDouble();

        System.out.print("Enter the number of months: ");
        int months = input.nextInt();

        double monthlyInterestRate = annualRate / 12;
        double totalAmount = 0;

        for (int i = 0; i < months; i++) {
            totalAmount = (amount + totalAmount) * (1 + monthlyInterestRate);
            System.out.println(totalAmount);
        }
    }
}

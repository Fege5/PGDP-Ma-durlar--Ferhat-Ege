package odevler.chapter06;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int maxYear = 30;

        System.out.print("The amount invested: ");
        double amount = input.nextDouble();

        System.out.print("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.printf("%-10s %-15s\n", "Years", "Future Value");

        for (int year = 1; year <= maxYear; year++) {
            double value = futureInvestmentValue(amount, annualInterestRate / 1200, year);
            System.out.printf("%-10d $%-14.2f\n", year, value);
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        double accumulatedValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12));
        return accumulatedValue;
    }
}
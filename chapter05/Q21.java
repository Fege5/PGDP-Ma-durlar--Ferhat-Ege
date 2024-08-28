package odevler.chapter05;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Number of years: ");
        int numberOfYears = input.nextInt();

        for (double annualInterestRate = 0.05; annualInterestRate <= 0.08; annualInterestRate += 0.00125) {
            double monthlyInterestRate = annualInterestRate / 12;

            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            double totalPayment = monthlyPayment * numberOfYears * 12;


            System.out.println("The monthly payment is $" +
                    (int) (monthlyPayment * 100) / 100.0);
            System.out.println("The total payment is $" +
                    (int) (totalPayment * 100) / 100.0);
        }
    }
}

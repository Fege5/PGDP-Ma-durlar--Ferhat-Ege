package ödevler.bölüm02;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        double numberOfYears = input.nextDouble();
        double accumulatedValue = amount * Math.pow((1 + (annualInterestRate / 1200)), (numberOfYears * 12));
        System.out.println("Accumulated value is $" + accumulatedValue);
    }
}

package ödevler.bölüm02;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double monthlySavingAmount = input.nextDouble();
        double annualInterestRate = 0.05;
        double monthlyInterestRate = annualInterestRate / 12;
        double valueAfterOneMonth = monthlySavingAmount * (1 + monthlyInterestRate);
        double valueAfterTwoMonths = (monthlySavingAmount + valueAfterOneMonth) * (1 + monthlyInterestRate);
        double valueAfterThreeMonths = (monthlySavingAmount + valueAfterTwoMonths) * (1 + monthlyInterestRate);
        double valueAfterFourMonths = (monthlySavingAmount + valueAfterThreeMonths) * (1 + monthlyInterestRate);
        double valueAfterFiveMonths = (monthlySavingAmount + valueAfterFourMonths) * (1 + monthlyInterestRate);
        double valueAfterSixMonths = (monthlySavingAmount + valueAfterFiveMonths) * (1 + monthlyInterestRate);
        System.out.println("After the sixth month, the account value is $" + valueAfterSixMonths);
    }
}

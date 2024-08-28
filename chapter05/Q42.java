package odevler.chapter05;

import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter commission: ");
    double requiredCommission = input.nextDouble();

    double salesAmount = 0.0;
    double commission = 0.0;


    for (salesAmount = 0.01; commission < requiredCommission; salesAmount += 0.01) {
        commission = 0.0;

        if (salesAmount > 10000) {
            commission += (salesAmount - 10000) * 0.12;
        }

        if (salesAmount > 5000) {
            commission += Math.min(salesAmount - 5000, 5000) * 0.10;
        }

        commission += Math.min(salesAmount, 5000) * 0.08;
    }

    System.out.println("The minimum sales amount needed to earn is: " + salesAmount);
}
}
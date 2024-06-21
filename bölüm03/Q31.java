package ödevler.bölüm03;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.print("Enter the dollar amount: ");
            double dollarAmount = input.nextDouble();
            double dollarToYen = dollarAmount * exchangeRate;
            System.out.println("$" + dollarAmount + " is " + dollarToYen + " yuan");
        } else if (number == 1) {
            System.out.print("Enter the RMB amount: ");
            double RMB = input.nextDouble();
            double yenToDollar = RMB / exchangeRate;
            System.out.println(RMB + " yuan is $" + yenToDollar);
        } else {
            System.out.print("Incorrect input");
        }
    }
}

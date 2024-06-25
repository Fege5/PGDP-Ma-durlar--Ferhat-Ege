package ödevler.bölüm04;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        int hours = input.nextInt();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        System.out.println("Employee Name: " + name);
        System.out.println("Hours worked: " + (double) hours);
        System.out.println("Pay rate: $" + payRate);
        double grossPay = payRate * 10;
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions: ");
        double federalWithholding = (grossPay * federalTax);
        System.out.println("Federal Withholding (" + (federalTax * 100) + "%): $" + federalWithholding);
        double stateWithholding = (payRate * 10) * stateTax;
        System.out.println("State Withholding (" + (stateTax * 100) + "%): $" + stateWithholding);
        double totalDeductions = ((payRate * 10) * (federalTax)) + ((payRate * 10) * stateTax);
        System.out.println("Total Deduction: $" + totalDeductions);
        System.out.println("Net Pay: $" + (grossPay - totalDeductions));
    }
}

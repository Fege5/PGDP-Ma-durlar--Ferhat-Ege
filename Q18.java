package ödevler.bölüm03;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of the package in pounds: ");
        double weight = input.nextDouble();
        double price = 0;
        if (weight <= 50) {
            if (0 < weight && weight <= 1) {
                price = 3.5;
            }
            if (1 < weight && weight <= 3) {
                price = 5.5;
            }
            if (3 < weight && weight <= 10) {
                price = 8.5;
            }
            if (10 < weight && weight <= 20) {
                price = 10.5;
            }
            System.out.println("The shipping cost is: " + price);
        }
        if (weight > 50) {
            System.out.println("The package cannot be shipped");
        }
    }
}

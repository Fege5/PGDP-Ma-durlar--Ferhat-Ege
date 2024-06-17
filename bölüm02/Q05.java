package ödevler.bölüm02;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double secondGratuity = gratuityRate / subtotal;
        double total = secondGratuity + subtotal;
        System.out.println("The gratuity is $" + secondGratuity + " and total is $" + total);
    }
}

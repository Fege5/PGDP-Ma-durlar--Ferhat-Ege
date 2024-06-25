package ödevler.bölüm04;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int value = input.nextInt();

        if (value < 0 || value > 15) {
            System.out.println(value + " is an invalid input");
        } else {
            String hex = Integer.toHexString(value).toUpperCase();
            System.out.println("The hex value is " + hex);
        }
    }
}

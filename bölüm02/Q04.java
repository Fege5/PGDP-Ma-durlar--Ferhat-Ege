package ödevler.bölüm02;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double numberInPounds = input.nextDouble();
        double numberInKilograms = 0.454 * numberInPounds;
        System.out.println(numberInPounds + " pounds is " + numberInKilograms + " kilograms ");
    }
}

package ödevler.bölüm02;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double numberInFeet = input.nextDouble();
        double numberInMeters = numberInFeet * 0.305;
        System.out.println(numberInFeet + " feet is " + numberInMeters + " meters ");
    }
}
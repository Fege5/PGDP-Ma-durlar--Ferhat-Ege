package ödevler.bölüm03;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = (b * b) - (4 * a * c);
        double positiveDiscriminant = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
        double negativeDiscriminant = (-b - Math.pow(discriminant, 0.5)) / (2 * a);

        if (discriminant < 0) {

            System.out.println("The equation has no real roots");

        } else if (discriminant == 0) {

            System.out.println("The equation has one root -1");

        } else {

            System.out.println("The equation has two roots " + positiveDiscriminant + " and " + negativeDiscriminant);


        }
    }
}

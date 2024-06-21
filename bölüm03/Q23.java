package ödevler.bölüm03;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double xInRectangle = 10 / 2.0;
        double yInRectangle = 5 / 2.0;

        if (xInRectangle > x && yInRectangle > y) {
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");

        } else {

            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
        }
    }
}

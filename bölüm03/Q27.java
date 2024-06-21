package ödevler.bölüm03;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point's x- and y-coordinates: ");
        double xCoordinate = input.nextDouble();
        double yCoordinate = input.nextDouble();

        int x1 = 0, y1 = 0;
        int x2 = 200, y2 = 0;
        int x3 = 0, y3 = 100;

        double A = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        double A1 = 0.5 * Math.abs(xCoordinate * (y2 - y3) + x2 * (y3 - yCoordinate) + x3 * (yCoordinate - y2));
        double A2 = 0.5 * Math.abs(x1 * (yCoordinate - y3) + xCoordinate * (y3 - y1) + x3 * (y1 - yCoordinate));
        double A3 = 0.5 * Math.abs(x1 * (y2 - yCoordinate) + x2 * (yCoordinate - y1) + xCoordinate * (y1 - y2));

        boolean isInTheTriangle =
                A == A1 + A2 + A3;

        if (isInTheTriangle) {
            System.out.println("The point is in the triangle");
        } else {
            System.out.println("The point is not in the triangle");
        }

    }
}

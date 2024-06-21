package ödevler.bölüm03;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double originX = 0;
        double originY = 0;
        double differenceInX = originX - x;
        double differenceInY = originY - y;

        if (Math.sqrt(Math.pow(differenceInX, 2) + Math.pow(differenceInY, 2)) <= 10) {

            System.out.println("Point (" + x + ", " + y + ") is in the circle");

        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the circle");
        }

    }
}

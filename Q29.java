package ödevler.bölüm03;

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double radius1 = input.nextDouble();

        System.out.println("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double radius2 = input.nextDouble();

        double distanceX = x2 - x1;
        double distanceY = y2 - y1;
        double distance = Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
        double distanceOfTwoCenters = radius1 - radius2;

        boolean isInside = distance <= Math.abs(distanceOfTwoCenters);

        boolean isOverlapping = distance <= (radius1 + radius2);

        if (isInside) {
            System.out.println("circle2 is inside circle1");
        } else if (isOverlapping) {
            System.out.println("circle2 overlaps circle1");
        } else {
            System.out.println("circle 2 does not overlap circle1");
        }


    }

}

package ödevler.bölüm04;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        double angle1 = Math.toRadians(90);
        double x1 = radius * Math.cos(angle1);
        double y1 = radius * Math.sin(angle1);

        double angle2 = Math.toRadians(90 + 72);
        double x2 = radius * Math.cos(angle2);
        double y2 = radius * Math.sin(angle2);

        double angle3 = Math.toRadians(90 + 2 * 72);
        double x3 = radius * Math.cos(angle3);
        double y3 = radius * Math.sin(angle3);

        double angle4 = Math.toRadians(90 + 3 * 72);
        double x4 = radius * Math.cos(angle4);
        double y4 = radius * Math.sin(angle4);

        double angle5 = Math.toRadians(90 + 4 * 72);
        double x5 = radius * Math.cos(angle5);
        double y5 = radius * Math.sin(angle5);

        System.out.println("The coordinates of five points on the pentagon are");
        System.out.println("(" + x1 + ", " + y1 + ")");
        System.out.println("(" + x2 + ", " + y2 + ")");
        System.out.println("(" + x3 + ", " + y3 + ")");
        System.out.println("(" + x4 + ", " + y4 + ")");
        System.out.println("(" + x5 + ", " + y5 + ")");

    }
}

package odevler.chapter06;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter six points for a triangle: ");
        double x1 = input.nextDouble();
        double x2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y1 = input.nextDouble();
        double y2 = input.nextDouble();
        double y3 = input.nextDouble();
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double side3 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));

        if (isValid(side1, side2, side3)) {
            double value = area(side1, side2, side3);
            System.out.println("The triangle is valid");
            System.out.println("The area of the triangle is " + value);
        } else {
            System.out.println("The triangle is not valid");
        }
    }

    public static boolean isValid(
            double side1, double side2, double side3) {
        if (side1 + side2 > side3 || side1 + side3 > side2 || side2 + side3 > side1) {
            return false;
        } else {
            return true;
        }
    }

    public static double area(
            double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

}

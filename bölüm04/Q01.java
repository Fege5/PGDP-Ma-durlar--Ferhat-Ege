package ödevler.bölüm04;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        double length = input.nextDouble();

        double side = 2 * length * Math.sin(Math.PI / 5);
        double areaOfAPentagon = (5 * side * side) / (4 * Math.tan(Math.PI / 5));
        double roundedAreaOfAPentagon = Math.round(areaOfAPentagon * 100) / 100.0;
        System.out.println("The area of a pentagon is " + roundedAreaOfAPentagon);

    }
}

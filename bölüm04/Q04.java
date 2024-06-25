package ödevler.bölüm04;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double areaOfHexagon = (6 * side * side) / (4 * Math.tan(Math.PI / 6));
        double roundedAreaOfHexagon = Math.round(areaOfHexagon * 100) / 100.0;
        System.out.println("The area of the hexagon is " + roundedAreaOfHexagon);
    }
}

package ödevler.bölüm04;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int numberOfSides = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = (numberOfSides * side * side) / (4 * Math.tan(Math.PI / numberOfSides));
        System.out.println("The area of the polygon is: " + area);
    }
}

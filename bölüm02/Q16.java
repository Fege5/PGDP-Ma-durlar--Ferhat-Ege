package ödevler.bölüm02;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double lengthOfSize = input.nextDouble();
        double area = lengthOfSize * lengthOfSize * ((3 * Math.sqrt(3)) / 2);
        System.out.print("The area of the hexagon is " + area);
    }
}

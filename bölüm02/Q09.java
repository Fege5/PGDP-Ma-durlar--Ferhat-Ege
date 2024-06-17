package ödevler.bölüm02;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t: ");
        double startingVelocity = input.nextDouble();
        double endingVelocity = input.nextDouble();
        double timeSpan = input.nextDouble();
        double averageAcceleration = (endingVelocity - startingVelocity) / timeSpan;
        System.out.println("The average acceleration is " + averageAcceleration);
    }
}

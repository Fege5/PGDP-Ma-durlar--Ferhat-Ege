package ödevler.bölüm02;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();
        double BMI = (weightInPounds * 0.45359237) / ((heightInInches * 0.0254) * (heightInInches * 0.0254));
        System.out.println("BMI is " + BMI);
    }
}

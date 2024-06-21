package ödevler.bölüm03;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstAnswer = " ";
        String secondAnswer = " ";
        String thirdAnswer = " ";

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        boolean isDivisibleByFive =
                number % 5 == 0;

        boolean isDivisibleBySix =
                number % 6 == 0;

        if (isDivisibleByFive == true && isDivisibleBySix == true) {
            firstAnswer = "true";
        } else {
            firstAnswer = "false";
        }

        if (isDivisibleByFive || isDivisibleBySix) {
            secondAnswer = "true";
        } else {
            secondAnswer = "false";
        }

        if (isDivisibleByFive ^ isDivisibleBySix) {
            thirdAnswer = "true";
        } else {
            thirdAnswer = "false";
        }

        System.out.println("Is " + number + " divisible by 5 and 6? " + firstAnswer);
        System.out.println("Is " + number + " divisible by 5 or 6? " + secondAnswer);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + thirdAnswer);

    }
}

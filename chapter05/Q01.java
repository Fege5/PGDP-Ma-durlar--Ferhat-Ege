package odevler.chapter05;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveNumber = 0;
        int negativeNumber = 0;
        int totalNumber = 0;
        double sum = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");

        for (int i = 0; i < 5; i++) {
            int number = input.nextInt();

            if (number == 0) {
                break;
            }
            if (number > 0) {
                positiveNumber++;
            } else {
                negativeNumber++;
            }
            sum += number;
            totalNumber++;
        }

        System.out.println("The number of positives is " + positiveNumber);
        System.out.println("The number of negatives is " + negativeNumber);
        System.out.println("The total is " + totalNumber);
        System.out.println("The average is " + sum / totalNumber);

    }
}

package odevler.chapter05;

import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double n4 = input.nextDouble();
        double n5 = input.nextDouble();
        double n6 = input.nextDouble();
        double n7 = input.nextDouble();
        double n8 = input.nextDouble();
        double n9 = input.nextDouble();
        double n10 = input.nextDouble();

        double deviation;
        double mean = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10) / 10;
        System.out.println("The mean is " + mean);

        if (n1 == n2 && n2 == n3 && n3 == n4 && n4 == n5 &&
                n5 == n6 && n6 == n7 && n7 == n8 && n8 == n9 && n9 == n10) {
            deviation = 0;
        } else {
            deviation = Math.sqrt(
                    (Math.pow(n1 - mean, 2) + Math.pow(n2 - mean, 2) + Math.pow(n3 - mean, 2) +
                            Math.pow(n4 - mean, 2) + Math.pow(n5 - mean, 2) + Math.pow(n6 - mean, 2) +
                            Math.pow(n7 - mean, 2) + Math.pow(n8 - mean, 2) + Math.pow(n9 - mean, 2) +
                            Math.pow(n10 - mean, 2)) / 9);
        }
        System.out.println("The standard deviation is: " + deviation);
    }
}

package odevler.chapter06;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        long n = input.nextInt();

        double sqrtValue = sqrt(n);
        System.out.println("The approximated square root of " + n + " is " + sqrtValue);
    }

    public static double sqrt(long n) {
        double lastGuess = 1.0;
        double nextGuess = (lastGuess + n / lastGuess) / 2.0;

        while (Math.abs(nextGuess - lastGuess) >= 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2.0;
        }

        return nextGuess;
    }
} //chatgptden yardım aldım

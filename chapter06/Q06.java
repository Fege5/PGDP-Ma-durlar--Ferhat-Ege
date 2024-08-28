package odevler.chapter06;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = input.nextInt();

        displayPattern(length);
    }

    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {

            for (int k = n - i; k > 0; k--) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
} //loopta biraz yardım aldım chatgptden

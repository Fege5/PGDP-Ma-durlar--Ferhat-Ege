package odevler.chapter06;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();
        printMatrix(n);
    }

    public static void printMatrix(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                int value = (int) (Math.random() * 10);
                if (value % 2 == 0) {
                    value = 0;
                } else {
                    value = 1;
                }
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

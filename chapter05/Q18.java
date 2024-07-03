package odevler.chapter05;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a pattern: ");
        String pattern = input.nextLine();

        int n = 6;

        if (pattern.equals("A")) {
            for (int i = 1; i <= n; i++) {
                int num = 1;

                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
                }

                System.out.println();
            }


        } else if (pattern.equals("B")) {
            for (int i = 6; i >= 1; i--) {
                int num = 1;

                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
                }

                System.out.println();
            }

            // C ve D'yi yapamadım...
        }
    }
}



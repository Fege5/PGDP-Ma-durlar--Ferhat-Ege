package odevler.chapter05;

import java.util.Scanner;

// Volkan hocaya sor!!

public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int lines = input.nextInt();

        if (lines > 15 || lines < 1) {
            System.out.println("Please enter a different number of lines between 1 and 15");
        } else {
            for (int i = 1; i <= lines; i++) {

                for (int j = 1; j <= lines - i; j++) {
                    System.out.print("  ");
                }


                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }

                for (int j = 2; j <= i; j++) {
                    System.out.print(j + " ");
                }

                System.out.println();
            }
        }
    }
}

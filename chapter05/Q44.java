package odevler.chapter05;

import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        short value = input.nextShort();

        System.out.print("The bits are: ");
        for (int i = 15; i >= 0; i--) {
            int bit = (value >> i) & 1;
            System.out.print(bit);
        }
        System.out.println();
    }
} //chatgptden yardım aldım
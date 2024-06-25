package ödevler.bölüm04;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount, for example 11.56: ");
        String amount = input.next();

        int indexOfDecimal = amount.indexOf('.');

        String dollar = amount.substring(0, indexOfDecimal);

        String cent = amount.substring(indexOfDecimal + 1);

        int dollars = Integer.parseInt(dollar);
        int cents = Integer.parseInt(cent);

        int remainingCents = cents % 100;

        System.out.println("Your amount " + amount + " consists of");
        System.out.println(dollars + " dollars");
        System.out.println(remainingCents + " cents");
    }
}

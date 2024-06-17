package ödevler.bölüm02;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        double minutes = input.nextDouble();
        int years = (int) ((minutes / 60) / 24) / 365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + (int) ((minutes / 60.0) / 24.0 % years) + " days ");
    }
}

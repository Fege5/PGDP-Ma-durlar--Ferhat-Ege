package odevler.chapter05;

public class Q06 {
    public static void main(String[] args) {

        int mile = 1;
        int kilometers = 20;
        double mileToKilometers = 1.609;
        double kilometerToMiles = 1 / mileToKilometers;

        System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");

        while (mile <= 10 && kilometers <= 65) {
            double kmNew = mileToKilometers * mile;
            double mileNew = kilometerToMiles * kilometers;

            System.out.printf("%-10d%-12.1f| %-10d%.2f%n", mile, kmNew, kilometers, mileNew);
            mile++;
            kilometers += 5;
        }

    }
}

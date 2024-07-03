package odevler.chapter05;

public class Q04 {
    public static void main(String[] args) {
        int mile = 1;

        System.out.println("Miles\tKilometers");

        for (; mile < 11; mile++) {
            double km = 1.609 * mile;
            System.out.printf("\t%d\t\t%.3f%n", mile, km);
        }

    }
}


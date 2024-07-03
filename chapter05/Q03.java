package odevler.chapter05;

public class Q03 {
    public static void main(String[] args) {

        int kg = 1;

        System.out.println("Kilograms\tPounds");

        for (; kg < 200; kg += 2) {
            double pound = 2.2 * kg;
            System.out.printf("\t%d\t\t%.1f%n", kg, pound);
        }

    }
}

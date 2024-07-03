package odevler.chapter05;

public class Q05 {
    public static void main(String[] args) {

        int kg = 1;
        int pounds = 20;
        double kgToPound = 2.2;
        double poundToKg = 1 / kgToPound;

        System.out.println("Kilograms\tPounds\t|\tPounds\tKilograms");

        while (kg < 200 && pounds <= 515) {
            double poundNew = kg * kgToPound;
            double kgNew = pounds * poundToKg;

            System.out.printf("%-11d%-10.1f| %-9d%.2f%n", kg, poundNew, pounds, kgNew);
            kg += 2;
            pounds += 5;
        }


    }
}
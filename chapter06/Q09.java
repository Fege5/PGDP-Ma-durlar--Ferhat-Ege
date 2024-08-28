package odevler.chapter06;

public class Q09 {
    public static void main(String[] args) {
        System.out.printf("%-10s %-15s\n", "Feet", "Meter");
        for (double i = 1.0; i <= 10.0; i = i + 1.0) {
            double value1 = footToMeter(i);
            System.out.printf("%-10.1f %-15.1f\n", i, value1);
        }

        System.out.printf("%-15s %-10s\n", "Meter", "Feet");
        for (double i = 20.0; i <= 65.0; i = i + 5.0) {
            double value2 = meterToFoot(i);
            System.out.printf("%-15.1f %-10.1f\n", i, value2);
        }
    }

    public static double footToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;
    }

    public static double meterToFoot(double meter) {
        double foot = 3.279 * meter;
        return foot;
    }

}

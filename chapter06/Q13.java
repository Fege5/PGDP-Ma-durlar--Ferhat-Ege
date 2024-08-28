package odevler.chapter06;

public class Q13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            double value = sum(i);
            System.out.println(i + ": " + value);
        }
    }

    public static double sum(int number) {
        double sum = 0.0;

        for (int i = 1; i <= number; i++) {
            double m = (double) i / (i + 1);
            sum += m;
        }

        return sum;
    }
}
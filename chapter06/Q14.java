package odevler.chapter06;

public class Q14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 901; i = i + 100) {
            double value = sum(i);
            System.out.println(i + ": " + value);
        }
    }

    public static double sum(int number) {
        double sum = 0.0;

        for (int i = 1; i <= number; i++) {
            double m = 4 * ((Math.pow(-1, i + 1)) / (2 * i - 1));
            sum += m;
        }

        return sum;
    }
}

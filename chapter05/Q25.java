package odevler.chapter05;

public class Q25 {
    public static void main(String[] args) {
        for (double i = 10000.0; i <= 100000.0; i += 10000.0) {
            double result = 4 * (1 - (Math.pow((-1), i + 1) / (2 * i - 1)));
            System.out.println("The value of pi for " + i + " is " + result);
        }

    }
}

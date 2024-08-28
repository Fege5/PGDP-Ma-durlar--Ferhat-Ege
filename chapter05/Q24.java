package odevler.chapter05;

public class Q24 {
    public static void main(String[] args) {
        double result = 0.0;

        for (int i = 1; i + 2 < 100; i += 2) {
            result += (double) i / (i + 2);
        }

        System.out.println(result);
    }
}

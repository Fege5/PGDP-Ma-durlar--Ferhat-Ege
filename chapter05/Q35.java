package odevler.chapter05;

public class Q35 {
    public static void main(String[] args) {
        int numerator = 1;
        double denominator;
        double result = 0;

        for (int i = 1; i <= 624; i++) {
            denominator = Math.sqrt(i) + Math.sqrt(i + 1);
            result += numerator / denominator;
        }

        System.out.println(result);
    }
}

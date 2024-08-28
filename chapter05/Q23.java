package odevler.chapter05;

public class Q23 {
    public static void main(String[] args) {
        int n = 50000;
        double sumRightToLeft = 0.0;
        double sumLeftToRight = 0.0;


        for (int i = n; i >= 1; i--) {
            sumRightToLeft += 1.0 / i;
        }

        for (int i = 1; i <= n; i++) {
            sumLeftToRight += 1.0 / i;
        }

        System.out.println(sumRightToLeft);
        System.out.println(sumLeftToRight);
        double difference = sumRightToLeft - sumLeftToRight;
        System.out.println("The difference between left and right is " + difference);
    }
}

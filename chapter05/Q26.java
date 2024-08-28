package odevler.chapter05;

public class Q26 {
    public static void main(String[] args) {
        for (int i = 10000; i <= 100000; i += 10000) {
            double e = 1.0;
            double factorial = 1.0;

            for (int j = 1; j <= i; j++) {
                factorial *= j;
                e += 1.0 / factorial;
            }

            System.out.println("The approximate value of e for i = " + i + " is " + e);
        }
    }
} //chatgpt'den yardım aldım
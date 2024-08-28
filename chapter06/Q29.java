package odevler.chapter06;

public class Q29 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println(i + ", " + (i + 2));
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
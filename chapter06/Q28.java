package odevler.chapter06;

public class Q28 {
    public static void main(String[] args) {
        for (int i = 1; i <= 31; i++) {
            if (isPrime(i)) {
                int result = mersennePrimeNumber(i);
                System.out.println(result);
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


    public static int mersennePrimeNumber(int n) {
        return (int) Math.pow(2, n) - 1;
    }

}


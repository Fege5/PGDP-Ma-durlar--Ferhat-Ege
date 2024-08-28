package odevler.chapter06;

public class Q27 {
    public static void main(String[] args) {
        int count = 0;
        int numberPerLine = 10;
        int i = 1;

        while (count < 100) {
            if (isPrime(i) && isPrime(reverse(i))) {
                System.out.print(i + " ");
                count++;

                if (count % numberPerLine == 0) {
                    System.out.println();
                }
            }
            i++;
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

    public static int reverse(int number) {
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }

        return reversedNumber;
    }
} //olmadı neden bilmiyorum
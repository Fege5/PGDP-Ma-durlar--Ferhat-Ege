package odevler.chapter06;

public class Q01 {


    public static void main(String[] args) {
        final int NUMBER_OF_NUMBERS_PER_LINE = 10;
        int n = 100;

        System.out.println("The first 100 pentagonal numbers are:\n");

        for (int i = 1; i <= n; i++) {
            int pentagonalNumber = getPentagonalNumber(i);

            System.out.printf("%-6d", pentagonalNumber);

            if (i % NUMBER_OF_NUMBERS_PER_LINE == 0) {
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}



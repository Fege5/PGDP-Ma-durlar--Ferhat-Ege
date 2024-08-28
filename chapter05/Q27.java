package odevler.chapter05;

public class Q27 {
    public static void main(String[] args) {
        int count = 0;
        final int NUMBER_OF_YEARS_PER_LINE = 10;

        for (int i = 101; i <= 2100; i++) {
            boolean isLeapYear = (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0);
            if (isLeapYear) {
                count++;

                if (count % NUMBER_OF_YEARS_PER_LINE == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        System.out.println("total number of leap years between 101 and 2100 is: " + count);

    }
}

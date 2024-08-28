package odevler.chapter05;

public class Q19 {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            int value = 1;

            for (int j = 0; j < 8 - i - 1; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value *= 2;
            }

            value /= 2;
            for (int j = 0; j < i; j++) {
                value /= 2;
                System.out.print(value + " ");
            }

            System.out.println();
        }
    }
}

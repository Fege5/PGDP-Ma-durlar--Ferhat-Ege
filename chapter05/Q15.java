package odevler.chapter05;

public class Q15 {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i <= 128; i++) {
            char ASCII = (char) i;
            System.out.print(ASCII + " ");
            count++;

            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}

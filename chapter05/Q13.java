package odevler.chapter05;

public class Q13 {
    public static void main(String[] args) {

        int n = 1;

        while (n * n * n <= 12000) {
            n++;
        }

        System.out.println(--n);
    }
}

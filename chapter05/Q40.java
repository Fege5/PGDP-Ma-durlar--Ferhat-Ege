package odevler.chapter05;

public class Q40 {
    public static void main(String[] args) {

        int numberOfHeads = 0;
        int numberOfTails = 0;

        for (int i = 1; i <= 1000000; i++) {
            int number = (int) (Math.random() * 10);
            if (number % 2 == 0) {
                numberOfHeads++;
            } else {
                numberOfTails++;
            }
        }

        System.out.println("Number of heads: " + numberOfHeads);
        System.out.println("Number of tails: " + numberOfTails);
    }
}

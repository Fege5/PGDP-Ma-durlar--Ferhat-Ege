package ödevler.bölüm03;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);

        System.out.println("Enter a guess, heads or tails?");
        String guess = stringScanner.next();
        String correctAnswer;

        int random = (int) (Math.random() * 2);
        if (random == 0) {
            correctAnswer = "heads";
        } else {
            correctAnswer = "tails";
        }

        if (guess.equals(correctAnswer)) {
            System.out.println("Your guess is correct!");
        } else {
            System.out.println("Your guess is incorrect :(");
        }
    }
}

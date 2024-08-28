package odevler.chapter06;

import java.util.Random;

public class Q32 {
    public static void main(String[] args) {
        Random rand = new Random();
        int winCount = 0;

        for (int i = 0; i < 10000; i++) {
            if (playCraps(rand)) {
                winCount++;
            }
        }

        System.out.println("Number of winning games: " + winCount);
    }

    public static boolean playCraps(Random rand) {
        int roll = rollDice(rand);

        if (isCraps(roll)) {
            return false;
        } else if (isNatural(roll)) {
            return true;
        } else {
            int point = roll;

            while (true) {
                roll = rollDice(rand);

                if (roll == 7) {
                    return false;
                } else if (roll == point) {
                    return true;
                }
            }
        }
    }

    public static int rollDice(Random rand) {
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        return die1 + die2;
    }

    public static boolean isCraps(int roll) {
        return (roll == 2 || roll == 3 || roll == 12);
    }

    public static boolean isNatural(int roll) {
        return (roll == 7 || roll == 11);
    }
} //chatgptden yardım aldım
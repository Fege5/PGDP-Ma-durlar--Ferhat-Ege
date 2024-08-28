package odevler.chapter06;

import java.util.Random;

public class Q30 {
    public static void main(String[] args) {
        Random rand = new Random();

        int roll = rollDice(rand);
        System.out.println("Initial roll: " + roll);

        if (isCraps(roll)) {
            System.out.println("Craps! You lose.");
        } else if (isNatural(roll)) {
            System.out.println("Natural! You win.");
        } else {
            int point = roll;
            System.out.println("Point is " + point);
            boolean gameContinues = true;

            while (gameContinues) {
                roll = rollDice(rand);
                System.out.println("Roll: " + roll);

                if (roll == 7) {
                    System.out.println("Rolled a 7! You lose.");
                    gameContinues = false;
                } else if (roll == point) {
                    System.out.println("Rolled the point! You win.");
                    gameContinues = false;
                }
            }
        }
    }

    public static int rollDice(Random rand) {
        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        return dice1 + dice2;
    }

    public static boolean isCraps(int roll) {
        return (roll == 2 || roll == 3 || roll == 12);
    }

    public static boolean isNatural(int roll) {
        return (roll == 7 || roll == 11);
    }

} //chatgptden oldukça yardım aldım
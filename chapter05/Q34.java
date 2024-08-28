package odevler.chapter05;

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int playerWins = 0;
        int computerWins = 0;

        while (Math.abs(playerWins - computerWins) <= 2) {
            System.out.print("scissors (0), rock (1), paper (2): ");
            int playersNumber = input.nextInt();
            int computersNumber = (int) (Math.random() * 3);

            String playersResult = "";
            String computersResult = "";
            String result = "";

            if (playersNumber == 0) {
                playersResult = "scissors";
            } else if (playersNumber == 1) {
                playersResult = "rock";
            } else if (playersNumber == 2) {
                playersResult = "paper";
            }

            if (computersNumber == 0) {
                computersResult = "scissors";
            } else if (computersNumber == 1) {
                computersResult = "rock";
            } else if (computersNumber == 2) {
                computersResult = "paper";
            }

            if (playersNumber == computersNumber) {
                result = "It's a draw!";
            } else if ((playersNumber == 0 && computersNumber == 2) ||
                    (playersNumber == 1 && computersNumber == 0) ||
                    (playersNumber == 2 && computersNumber == 1)) {
                result = "You won!";
                playerWins++;
            } else {
                result = "You lost!";
                computerWins++;
            }

            System.out.println("The computer chose " + computersResult + ". You chose " + playersResult + ". " + result);
            System.out.println("Score -> You: " + playerWins + ", Computer: " + computerWins);
        }

        if (playerWins > computerWins) {
            System.out.println("Congratulations! You won the game.");
        } else {
            System.out.println("The computer won the game. Better luck next time!");
        }
    }
}  //chatgptden yardım aldım

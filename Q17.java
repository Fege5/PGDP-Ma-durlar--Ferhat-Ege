package ödevler.bölüm03;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("scissors (0), rock (1), paper (2): ");
        String result = " ";
        int playersNumber = input.nextInt();
        String playersResult = " ";
        int computersNumber = (int) (Math.random() * 3);
        String computersResult = " ";
        if (computersNumber == 0) {
            computersResult = "scissors";
            if (playersNumber == 0) {
                playersResult = "scissor too";
                result = "It is a draw";
            }
            if (playersNumber == 1) {
                playersResult = "rock";
                result = "You won";
            }
            if (playersNumber == 2) {
                playersResult = "paper";
                result = "You lose";
            }
        }
        if (computersNumber == 1) {
            computersResult = "rock";
            if (playersNumber == 1) {
                playersResult = "rock too";
                result = "It is a draw";
            }
            if (playersNumber == 2) {
                playersResult = "paper";
                result = "You won";
            }
            if (playersNumber == 0) {
                playersResult = "scissor";
                result = "You lose";
            }
        }
        if (computersNumber == 2) {
            computersResult = "paper";
            if (playersNumber == 2) {
                playersResult = "paper too";
                result = "It is a draw";
            }
            if (playersNumber == 0) {
                playersResult = "scissor";
                result = "You won";
            }
            if (playersNumber == 1) {
                playersResult = "rock";
                result = "You lose";
            }
        }
        System.out.println("The computer is " + computersResult + " You are " + playersResult + ". " + result);
    }
}

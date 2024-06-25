package ödevler.bölüm04;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String hex = input.nextLine();

        if (hex.length() != 1 || !((hex.charAt(0) >= '0' && hex.charAt(0) <= '9') || (hex.charAt(0) >= 'A' && hex.charAt(0) <= 'F'))) {
            System.out.println(hex + " is an invalid input");
        } else {
            String binary;
            switch (hex) {
                case "0":
                    binary = "0000";
                    break;
                case "1":
                    binary = "0001";
                    break;
                case "2":
                    binary = "0010";
                    break;
                case "3":
                    binary = "0011";
                    break;
                case "4":
                    binary = "0100";
                    break;
                case "5":
                    binary = "0101";
                    break;
                case "6":
                    binary = "0110";
                    break;
                case "7":
                    binary = "0111";
                    break;
                case "8":
                    binary = "1000";
                    break;
                case "9":
                    binary = "1001";
                    break;
                case "A":
                    binary = "1010";
                    break;
                case "B":
                    binary = "1011";
                    break;
                case "C":
                    binary = "1100";
                    break;
                case "D":
                    binary = "1101";
                    break;
                case "E":
                    binary = "1110";
                    break;
                case "F":
                    binary = "1111";
                    break;
                default:
                    binary = "";
            }

            System.out.println("The binary equivalent of " + hex + " is " + binary);
        }

    }
}
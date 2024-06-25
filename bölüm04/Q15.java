package ödevler.bölüm04;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);

        if (!((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z'))) {
            System.out.println(letter + " is an invalid input");
        } else {
            int number = 0;
            switch (Character.toLowerCase(letter)) {
                case 'a':
                case 'b':
                case 'c':
                    number = 2;
                    break;
                case 'd':
                case 'e':
                case 'f':
                    number = 3;
                    break;
                case 'g':
                case 'h':
                case 'i':
                    number = 4;
                    break;
                case 'j':
                case 'k':
                case 'l':
                    number = 5;
                    break;
                case 'm':
                case 'n':
                case 'o':
                    number = 6;
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    number = 7;
                    break;
                case 't':
                case 'u':
                case 'v':
                    number = 8;
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    number = 9;
                    break;

            }
            System.out.println("The corresponding number is " + number);
        }
    }
}

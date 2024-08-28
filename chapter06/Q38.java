package odevler.chapter06;

public class Q38 {
    public static void main(String[] args) {
        int perLine = 10;
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            char letter = getRandomUpperCaseLetter();
            System.out.print(letter + " ");

            count++;
            if (count % perLine == 0) {
                System.out.println();
            }
        }
        for (int i = 1; i <= 100; i++) {
            int digit = getRandomDigitCharacter();
            System.out.print(digit + " ");

            count++;
            if (count % perLine == 0) {
                System.out.println();
            }
        }
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /**
     * Generate a random lowercase letter
     */
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    /**
     * Generate a random uppercase letter
     */
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    /**
     * Generate a random digit character
     */
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    /**
     * Generate a random character
     */
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}


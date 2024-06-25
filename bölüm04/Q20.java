package ödevler.bölüm04;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();
        int length = s.length();
        char firstCharacter = s.charAt(0);

        System.out.println("The length of the string is: " + length + " and the first character is: " + firstCharacter);
    }
}

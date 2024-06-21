package ödevler.bölüm03;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int integer = input.nextInt();

        boolean isPalindrome =
                integer % 10 == integer / 100;

        if (isPalindrome == false) {
            System.out.println(integer + " is not a palindrome");
        } else {
            System.out.println(integer + " is a palindrome");
        }
    }

}

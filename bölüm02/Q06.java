package ödevler.bölüm02;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int integer = input.nextInt();
        int lastDigit = (integer % 10);
        int secondLastDigit = (integer / 10) % 10;
        int thirdLastDigit = ((integer / 10) / 10) % 10;
        int fourthLastDigit = (((integer / 10) / 10) / 10) % 10;
        int sumOfDigits = lastDigit + secondLastDigit + thirdLastDigit + fourthLastDigit;
        System.out.println("The sum of the digits is " + sumOfDigits);
    }
}

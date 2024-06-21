package ödevler.bölüm03;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // başında 0 olursa sıkıntı oluyor, volkan hocaya sor !!
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int firstNineDigits = input.nextInt();
        int tenthDigit = ((firstNineDigits % 1000000000) * 1 + (firstNineDigits % 100000000) * 2 + (firstNineDigits % 10000000) * 3 + (firstNineDigits % 1000000) * 4 + (firstNineDigits % 100000) * 5 + (firstNineDigits % 10000) * 6 + (firstNineDigits % 1000) * 7 + (firstNineDigits % 100) * 8 + (firstNineDigits % 10) * 9) % 11;
        int newNumber = (firstNineDigits * 10) + tenthDigit;
        System.out.println("The ISBN-10 number is " + newNumber);
    }
}

package ödevler.bölüm03;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a temperature and a wind speed: ");
        double temperature = input.nextDouble();
        double windSpeed = input.nextDouble();

        if (-58 <= temperature && temperature <= 41 && windSpeed >= 2) {
            System.out.println("The wind-chill temperature is  valid.");
        } else {
            System.out.println("The wind-chill temperature is invalid.");
        }
    }
}

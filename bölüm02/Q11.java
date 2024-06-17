package ödevler.bölüm02;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();
        double population = 312032486;
        double birth_in_one_year = (60.0 / 7) * 60.0 * 24 * 365;
        double death_in_one_year = (60.0 / 13) * 60.0 * 24 * 365;
        double immigrant_in_one_year = (60.0 / 45) * 60 * 24 * 365;
        double yearly_difference = birth_in_one_year + immigrant_in_one_year - death_in_one_year;
        System.out.println("The population in 5 years is " + (int) (population + numberOfYears * yearly_difference));
    }
}

package odevler.chapter06;

public class Q08 {
    public static void main(String[] args) {

        System.out.printf("%-10s %-15s\n", "Celsius", "Fahrenheit");
        for (double i = 40.0; i >= 31.0; i--) {
            double value1 = celsiusToFahrenheit(i);
            System.out.printf("%-10.1f %-15.1f\n", i, value1);
        }

        System.out.printf("%-15s %-10s\n", "Fahrenheit", "Celsius");
        for (double i = 120.0; i >= 30.0; i = i - 10) {
            double value2 = fahrenheitToCelsius(i);
            System.out.printf("%-15.1f %-10.1f\n", i, value2);
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}

package ödevler.bölüm04;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double lat1 = input.nextDouble();
        double lon1 = input.nextDouble();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double lat2 = input.nextDouble();
        double lon2 = input.nextDouble();

        double convertedLat1 = Math.toRadians(lat1);
        double convertedLon1 = Math.toRadians(lon1);
        double convertedLat2 = Math.toRadians(lat2);
        double convertedLon2 = Math.toRadians(lon2);

        double distance = 6371.01 *
                Math.acos(Math.sin(convertedLat1) *
                        Math.sin(convertedLat2) +
                        Math.cos(convertedLat1) *
                                Math.cos(convertedLat2) *
                                Math.cos(convertedLon1 - convertedLon2));

        System.out.println("The distance between the two points is " + distance + " km");
    }
}

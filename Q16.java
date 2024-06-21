package ödevler.bölüm03;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        int width = 100;
        int height = 200;
        double xMin = -width / 2;
        double xMax = width / 2;
        double yMin = -height / 2;
        double yMax = height / 2;

        double randomPoint = Math.random();
        double x = xMin + (xMax - xMin) * randomPoint;
        double y = yMin + (yMax - yMin) * randomPoint;

        System.out.println("These coordinates are in the rectangle; x: " + x + " y: " + y);
    }
}

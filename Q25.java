package ödevler.bölüm03;

import java.util.Scanner;

// volkan hocaya sor !!

public class Q25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        double a = (y1 - y2) * x1;
        double b = -(x1 - x2) * y1;
        double c = (y3 - y4) * x3;
        double d = -(x3 - x4) * y3;




    }
}

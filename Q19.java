package ödevler.bölüm03;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three edges for a triangle: ");
        double edgeA = input.nextDouble();
        double edgeB = input.nextDouble();
        double edgeC = input.nextDouble();

        if (edgeA + edgeB > edgeC && edgeA + edgeC > edgeB && edgeB + edgeC > edgeA){
            System.out.println("The input is valid.");
        } else {
            System.out.println("The input is invalid.");
        }
    }
}

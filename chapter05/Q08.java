package odevler.chapter05;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        String topStudent = " ";
        double topScore = -1;

        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter each student's name and score: ");
            String name = input.next();
            double score = input.nextDouble();

            if (score > topScore) {
                topStudent = name;
                topScore = score;
            }
        }

        System.out.println("Top student: " + topStudent);

    }
}

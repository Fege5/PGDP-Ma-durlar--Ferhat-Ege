package odevler.chapter05;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        String topStudent = " ";
        String secondTopStudent = " ";
        double topScore = -1;
        double secondTopScore = -1;

        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter each student's name and score: ");
            String name = input.next();
            double score = input.nextDouble();

            if (score > topScore) {
                secondTopScore = topScore;
                secondTopStudent = topStudent;

                topScore = score;
                topStudent = name;

            } else if (score > secondTopScore) {
                secondTopScore = score;
                secondTopStudent = name;
            }
        }

        System.out.println("Top student: " + topStudent);
        System.out.println("Second top student: " + secondTopStudent);

    }
}

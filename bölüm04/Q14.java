package ödevler.bölüm04;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        Character grade = input.next().charAt(0);

        if (!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')) {
            System.out.println(grade + " is an ivalid grade");
        } else {
            int value = 0;
            switch (grade) {
                case 'A':
                    value = 4;
                    break;
                case 'B':
                    value = 3;
                    break;
                case 'C':
                    value = 2;
                    break;
                case 'D':
                    value = 1;
                    break;
                case 'F':
                    value = 0;
                    break;
            }
            System.out.println("The numeric value for grade " + grade + " is " + value);
        }

    }
}

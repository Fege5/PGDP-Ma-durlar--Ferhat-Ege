package ödevler.bölüm04;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        Character a = input.next().charAt(0);
        Integer b = input.nextInt();
        String subject = " ";
        String year = " ";

        switch (a) {
            case 'M':
                subject = "Mathematics";
                break;
            case 'C':
                subject = "Computer Science";
                break;
            case 'I':
                subject = "Information Technology";
                break;
        }
        switch (b) {
            case 1:
                year = "Freshman";
                break;
            case 2:
                year = "Sophomore";
                break;
            case 3:
                year = "Junior";
                break;
            case 4:
                year = "Senior";
                break;
        }

        if (!((a == 'M' || a == 'C' || a == 'I') && (b == 1 || b == 2 || b == 3 || b == 4))) {
            System.out.println("Invalid input");
        } else {
            System.out.println(subject + " " + year);
        }
    }
}

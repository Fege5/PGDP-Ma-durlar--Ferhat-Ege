package odevler.chapter05;

public class Q39 {
    public static void main(String[] args) {
        double baseSalary = 5000.0;
        double requiredCommission = 25000;

        double salesAmount = 0.0;
        double commission = 0.0;

        while (commission < requiredCommission) {

            salesAmount += 0.01;

            commission = 0.0;

            if (salesAmount > 10000) {
                commission += (salesAmount - 10000) * 0.12;
            }

            if (salesAmount > 5000) {
                commission += Math.min(salesAmount - 5000, 5000) * 0.10;
            }

            commission += Math.min(salesAmount, 5000) * 0.08;
        }

        System.out.printf("The minimum sales amount needed to earn $30,000 is: $%.2f\n", salesAmount);
    }
} //chatgptden yardım aldım
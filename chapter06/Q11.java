package odevler.chapter06;

public class Q11 {
    public static void main(String[] args) {
        for (double i = 10000; i <= 100000; i = i + 5000) {
            double value1 = computeCommission(i);
            System.out.printf("%-20s %-15s\n", "Sales Amount", "Commission");
            System.out.printf("%-20f %-15.1f\n", i, value1);
        }
    }

    public static double computeCommission(double salesAmount) {
        salesAmount += 0.01;

        double commission = 0.0;

        if (salesAmount > 10000) {
            commission += (salesAmount - 10000) * 0.12;
        }

        if (salesAmount > 5000) {
            commission += Math.min(salesAmount - 5000, 5000) * 0.10;
        }

        commission += Math.min(salesAmount, 5000) * 0.08;
        return commission;
    }
}



package odevler.chapter05;

public class Q07 {
    public static void main(String[] args) {
        double tuition1 = 10000;
        double increaseRate = 0.05;
        double cost = 0;

        for (int i = 0; i < 10; i++) {
            tuition1 += tuition1 * increaseRate;
        }

        double tuition2 = tuition1;
        
        for (int i = 11; i < 15; i++) {
            tuition2 += tuition2 * increaseRate;
            cost += tuition2;
        }

        System.out.println("The tuition1 in ten years: " + tuition1 + " the total cost of four years' worth of tuition after the tenth year: " + cost);
    }
}

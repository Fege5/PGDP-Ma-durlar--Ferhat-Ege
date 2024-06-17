package ödevler.bölüm01;

public class Q12 {
    public static void main(String[] args) {
        double total_meter = 24 * 1.6 * 1000;
        double total_seconds = 35 + 40 * 60 + 1.0 * 3600;
        double meter_second = total_meter / total_seconds;
        System.out.println(meter_second * 3.6);
    }
}

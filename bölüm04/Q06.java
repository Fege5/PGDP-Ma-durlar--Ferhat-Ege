package ödevler.bölüm04;

public class Q06 {
    public static void main(String[] args) {

        final double radius = 40;

        double angle1 = Math.random() * (2 * Math.PI);
        double angle2 = Math.random() * (2 * Math.PI);
        double angle3 = Math.random() * (2 * Math.PI);

        double x1 = radius * Math.cos(angle1);
        double y1 = radius * Math.sin(angle1);
        double x2 = radius * Math.cos(angle2);
        double y2 = radius * Math.sin(angle2);
        double x3 = radius * Math.cos(angle3);
        double y3 = radius * Math.sin(angle3);

        double distance1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double distance2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double distance3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        double angleA = Math.toDegrees(Math.acos
                ((distance1 * distance1
                        - distance2 * distance2
                        - distance3 * distance3)
                        / (-2 * distance2 * distance3)));

        double angleB = Math.toDegrees(Math.acos
                ((distance2 * distance2
                        - distance1 * distance1
                        - distance3 * distance3)
                        / (-2 * distance1 * distance3)));

        double angleC = Math.toDegrees(Math.acos
                ((distance3 * distance3 -
                        distance2 * distance2
                        - distance1 * distance1) / (-2 * distance1 * distance2)));

        System.out.println("Here are the three angles in a triangle: " + angleA + " and " + angleB + " and " + angleC);
    }
}

package ödevler.bölüm04;

public class Q03 {
    public static void main(String[] args) {

        double latCharlotte = 35.2270869;
        double lonCharlotte = -80.8431267;
        double latAtlanta = 33.7489954;
        double lonAtlanta = -84.3879824;
        double latOrlando = 28.5383355;
        double lonOrlando = -81.3792365;
        double latSavannah = 32.0835407;
        double lonSavannah = -81.0998342;

        double convertedLatCharlotte = Math.toRadians(latCharlotte);
        double convertedLonCharlotte = Math.toRadians(lonCharlotte);
        double convertedLatAtlanta = Math.toRadians(latAtlanta);
        double convertedLonAtlanta = Math.toRadians(lonAtlanta);
        double convertedLatOrlando = Math.toRadians(latOrlando);
        double convertedLonOrlando = Math.toRadians(lonOrlando);
        double convertedLatSavannah = Math.toRadians(latSavannah);
        double convertedLonSavannah = Math.toRadians(lonSavannah);


        double distanceCharlotteToAtlanta = 6371.01 *
                Math.acos(Math.sin(convertedLatCharlotte) *
                        Math.sin(convertedLatAtlanta) +
                        Math.cos(convertedLatCharlotte) *
                                Math.cos(convertedLatAtlanta) *
                                Math.cos(convertedLonCharlotte - convertedLonAtlanta));

        double distanceAtlantaToOrlando = 6371.01 *
                Math.acos(Math.sin(convertedLatAtlanta) *
                        Math.sin(convertedLatOrlando) +
                        Math.cos(convertedLatAtlanta) *
                                Math.cos(convertedLatOrlando) *
                                Math.cos(convertedLonAtlanta - convertedLonOrlando));

        double distanceOrlandoToSavannah = 6371.01 *
                Math.acos(Math.sin(convertedLatOrlando) *
                        Math.sin(convertedLatSavannah) +
                        Math.cos(convertedLatOrlando) *
                                Math.cos(convertedLatSavannah) *
                                Math.cos(convertedLonOrlando - convertedLonSavannah));

        double distanceSavannahToCharlotte = 6371.01 *
                Math.acos(Math.sin(convertedLatSavannah) *
                        Math.sin(convertedLatCharlotte) +
                        Math.cos(convertedLatSavannah) *
                                Math.cos(convertedLatCharlotte) *
                                Math.cos(convertedLonSavannah - convertedLonCharlotte));

        double distanceCharlotteToOrlando = 6371.01 *
                Math.acos(Math.sin(convertedLatCharlotte) *
                        Math.sin(convertedLatOrlando) +
                        Math.cos(convertedLatCharlotte) *
                                Math.cos(convertedLatOrlando) *
                                Math.cos(convertedLonCharlotte - convertedLonOrlando));


        double s1 = (distanceCharlotteToAtlanta + distanceAtlantaToOrlando + distanceCharlotteToOrlando) / 2;
        double area1 = Math.sqrt(s1 * (s1 - distanceCharlotteToAtlanta) * (s1 - distanceAtlantaToOrlando) * (s1 - distanceCharlotteToOrlando));

        double s2 = (distanceOrlandoToSavannah + distanceSavannahToCharlotte + distanceCharlotteToOrlando) / 2;
        double area2 = Math.sqrt(s2 * (s2 - distanceOrlandoToSavannah) * (s2 - distanceSavannahToCharlotte) * (s2 - distanceCharlotteToOrlando));

        double totalArea = area1 + area2;
        System.out.println("The estimated area enclosed by these four cities is " + totalArea + " km^2");
    }
}

package ödevler.bölüm01;

public class Q11 {
    public static void main(String[] args) {
        double population = 312032486;
        double birth_in_one_year = (60.0 / 7) * 60 * 24 * 365;
        double death_in_one_year = (60.0 / 13) * 60 * 24 * 365;
        double immigrant_in_one_year = (60.0 / 45) * 60 * 24 * 365;
        double yearly_difference = birth_in_one_year + immigrant_in_one_year - death_in_one_year;
        System.out.println(population);
        System.out.println(population + yearly_difference);
        System.out.println(population + yearly_difference + yearly_difference);
        System.out.println(population + yearly_difference + yearly_difference + yearly_difference);
        System.out.println(population + yearly_difference + yearly_difference + yearly_difference + yearly_difference);
        System.out.println(population + yearly_difference + yearly_difference + yearly_difference + yearly_difference + yearly_difference);
    }
}

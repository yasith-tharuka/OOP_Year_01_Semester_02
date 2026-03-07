public class T2Q1 {

    public static final double KM_PER_MILE = 1.609;
    public static final double MILES_PER_YARD = 1760.0;
    public static void main(String[] args) {
        int miles = 26;
        int yards = 385;
        double km = 0;

        km = (miles + yards / MILES_PER_YARD) * KM_PER_MILE;

        System.out.println(km);

    }
}
package Week_01.Task02;

public class Q02 {
    public static void main(String[] args) {
        final double KM_PER_MILE = 1.609;
        final double YARDS_PER_MILE = 1760.0;

        int yards = 385;
        int miles = 26;
        double km;

        km =  (miles* KM_PER_MILE) + (yards * (KM_PER_MILE / YARDS_PER_MILE));

        System.out.println("Marathon Distance : "+ km);

        //Answer is : 43.18596875
    }
}

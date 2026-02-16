package Week_03.Task01;


public class Q01 {
    public static void main(String[] args) {
        int yards = 385;
        int miles = 26;
        double km;

        km =  (miles* 1.609) + (yards * (1.609 / 1760.0));

        System.out.println("Marathon Distance : "+ km);

        //Answer is : 43.18596875



    }
}

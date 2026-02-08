package Week_01.Task04;

public class Q04 {
    public static void main(String[] args) {
        if(args.length ==0){
            System.out.println("Please enter an argument");
            return;
        }
        int cc = Integer.parseInt(args[0]);

        double ff = 1.8 * cc +32;

        System.out.println("Celsius : "+ cc+ "\n Fahrenheit : "+ ff);
    }
}

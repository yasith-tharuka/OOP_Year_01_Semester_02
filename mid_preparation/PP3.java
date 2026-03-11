import java.util.Scanner;

public class PP3 {

    public static void calculateDCvolatagedrop(int time, float length){
        double voltage = length * Math.sqrt(Math.pow(time,2));
        String impact;

        if(voltage > 0 && voltage < 25){
            impact = "Small Impact";
        }else if (voltage < 100){
            impact = "Medium Impact";
        }else if (voltage > 100){
            impact = "High";
        }else{
            impact = "Error";
        }

        System.out.println("Calculated DC voltage drop is "+voltage+ " impact is "+impact);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Time : ");
        int time = scanner.nextInt();

        System.out.println("Enter your Length of Circuit : ");
        float length = scanner.nextFloat();

        calculateDCvolatagedrop(time, length);

        scanner.close();

    }
}
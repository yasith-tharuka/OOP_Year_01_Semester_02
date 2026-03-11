import java.util.Scanner;

public class PP1 {

    final double m = 250.74;

    double calculateCicularForce(float velocity, float radius) {
        double cForce = (m * Math.pow(velocity, 2)) / radius;
        return cForce;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PP1 newPP1 = new PP1();

        System.out.println("Enter Velocity: ");
        float velocity = scanner.nextFloat();

        System.out.println("Enter radius : ");
        float radius = scanner.nextFloat();


        double a = newPP1.calculateCicularForce(velocity,radius);

        System.out.println("THe Circular Force is : "+a);

        String output;

        if(a>=0 && a<= 100){
            output = "Low Impact";
        } else if (a<= 150){
            output = "Noraml Impact";
        } else if(a<=200){
            output = "High Impact";
        } else{
            output = "Ultra Impact";
        }

        System.out.printf("The Output is : %s\n",output);


        scanner.close();
    }

}
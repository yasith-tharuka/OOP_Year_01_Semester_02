import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the weight of a person : ");
        int weight = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Number of persons : ");
        int person = scanner.nextInt();

        int totWeight = weight * person;

        if(1320 < totWeight){
            System.out.println("Elevator cannot support the weight of the peoples");

        }

        int count = 1320 / weight;

        System.out.println("Number of people can fit on the elevator : " + count);

        scanner.close();
    }
}

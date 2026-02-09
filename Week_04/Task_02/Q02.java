import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you full name : ");
        String name = scanner.nextLine();

        System.out.println("Enter you Zodiac sign : ");
        String zodiac = scanner.next();

        System.out.println("Enter your weight : ");
        double weight = scanner.nextDouble();

        System.out.println("Enter your lucky number : ");
        int luckyNum = scanner.nextInt();

        System.out.printf("Hello, %s . \nYour Lucky Number is %s .\nYou weight %f kg.\nYour Zodiac sign is %s . ",name,luckyNum,weight,zodiac);;

        scanner.close();
    }
}

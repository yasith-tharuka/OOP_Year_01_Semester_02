import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the item name : ");
        String name = scanner.nextLine();

        System.out.println("Enter the Unit Price : ");
        double price = scanner.nextDouble();

        System.out.println("Enter the quantity : ");
        int quantity = scanner.nextInt();
        System.out.println("Item name : " + name);
        System.out.println("The total cost will be "+ (price*quantity) + " ruppees. ");
        scanner.close();
    }
}

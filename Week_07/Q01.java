import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scanner.nextLine();
        String arr[] = input.split("");

        for(String i : arr){
            System.out.println(i);
        }
        scanner.close();
    }

}

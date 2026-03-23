/*4.	Write a program that asks for user's name and then writes it back with the first name(s) as initials
, and the last name all in capital letters. */

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your name: ");
        String input = scanner.nextLine();

        String arr[] = input.split(" ");
        char firstName = arr[0].charAt(0);
        String LastName = arr[1].toUpperCase();

        System.out.println(firstName + " " + LastName);
    }
}

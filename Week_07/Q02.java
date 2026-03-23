/*
2.	Write a program to extract a portion of a character string and print the extracted string.
 The program should read a string first and then take inputs for m and n, where extraction starts 
 with the nth character and m characters get extracted.
*/

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String input = scanner.nextLine();
        System.out.println("Enter starting character(n): ");
        int n = scanner.nextInt();
        System.out.println("Enter number of char to extract(m):");
        int m = scanner.nextInt();

        int startIndex = n-1;
        int endIndex = startIndex + m;

        String output = input.substring(startIndex,endIndex);


        System.out.println("The output is "+ output);
    }
}

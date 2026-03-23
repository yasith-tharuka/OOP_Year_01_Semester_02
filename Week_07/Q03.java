/*3.	Write a program that read a string first and then take an input for c, where cth character 
get deleted and the program echoes the string to the monitor without the deleted character.
Write a separate method call delete(String word, int ch) that returns the input word with the cth element removed.
*/

import java.util.Scanner;

public class Q03 {

    static void delete(String word, int ch) {
        String new_Word = word.substring(0, ch) + word.substring(ch + 1);

        System.out.println("The Ourput is : " + new_Word);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String input = scanner.nextLine();
        System.out.println("Enter Delete Char Index(C):");
        int num = scanner.nextInt();

        delete(input, num);

        scanner.close();

    }
}

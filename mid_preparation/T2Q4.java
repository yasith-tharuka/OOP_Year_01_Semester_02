/*
(1)	Write a program to calculate the volume of a cube when height, width and length are input through command-line arguments as double values.

Hint:		 use Double.parseDouble()
Usage:	 double k = Double. parseDouble(<string>);
*/
public class T2Q4 {
    public static void main(String[] args) {

        double volume = 0;

        try {
            double height = Double.parseDouble(args[0]);
            double width = Double.parseDouble(args[1]);
            double length = Double.parseDouble(args[2]);

            volume = height * width * length;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("The volume of the cube: " + volume);
    }
}
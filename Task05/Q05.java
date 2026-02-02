package Task05;

public class Q05 {
    public static void main(String[] args) {
        if(args.length != 3  ){
            System.out.println("Invalid Input count");
            return;
        }
        double height = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);
        double length = Double.parseDouble(args[2]);

        double volume = length * width * height;
        System.out.println( "The Volume of the cube is : "+ volume);
    }
}

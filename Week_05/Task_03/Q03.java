
public class Q03 {
    public static void main(String[] args) {
        int numOne = Integer.parseInt(args[0]);
        int numTwo = Integer.parseInt(args[1]);

        int max = (numOne < numTwo)? numTwo : numOne;
        System.out.println("Max value is : "+ max);


    }
}

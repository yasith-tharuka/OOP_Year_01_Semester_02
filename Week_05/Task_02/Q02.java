package Week_05.Task_02;

public class Q02 {
    public static void main(String[] args) {
         if(args.length == 0 ){
            System.out.println("Please provide an Input");
            return;
        }

        int numOne = Integer.parseInt(args[0]);
        int numTwo = Integer.parseInt(args[1]);

        if(numOne > numTwo){
            System.out.println("Minimum is : " + numTwo);
        }else{
            System.out.println("Minimum one is "+ numOne);
        }

    }

}

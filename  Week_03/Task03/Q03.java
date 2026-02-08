package Week_03.Task03;

public class Q03 {
    public static void main(String[] args) {
        System.out.println("Number of CLI arg : "+args.length );

        if(args.length >= 2){
            for (int i = 0; i < args.length; i++ ){
                System.out.println("Argument "+ i + " is : "+args[i]);
            }
        }else {
            System.out.println("No enough args");
        }
    }
}

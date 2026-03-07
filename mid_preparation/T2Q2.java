public class T2Q2 {
    public static void main(String[] args) {
        /*
         * if(args.length > 1){
         * System.out.println("CLA 01: "+ args[0] + "\nCLA 02: " + args[1] +
         * "\nLength is: "+args.length);
         * }else{
         * System.out.println("No CLA found");
         * }
         */

        try {

            System.out.println("------------------\n" + args[0] + " : " + args[1] + "\n-----------------");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("-------------------\n No Command Line Arguments found :-" + e.getMessage()
                    + "\n-------------------");
        }
    }
}
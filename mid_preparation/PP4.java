public class PP4 {

    public static void main(String[] args) {
        try {
            int Fnum = Integer.parseInt(args[0]);
            int Snum = Integer.parseInt(args[1]);
            int output = 0;

            for(int i = Fnum; i <= Snum; i++){
                int cube = (int)(Math.pow(i, 3));
                output += cube;
            }

            System.out.println("Output is : " + output);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error found : " + e.getMessage());
        }
    }
}
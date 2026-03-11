public class PP2 {
    public static void main(String[] args) {
        try {
            int Fnum = Integer.parseInt(args[0]);
            int Snum = Integer.parseInt(args[1]);
            double sum = 0;

            if (Fnum < Snum) {
                for (int i = Fnum + 1; i <= Snum; i++) {
                    sum += Math.tan(Math.toRadians(i));
                    System.out.println(Math.tan(Math.toRadians(i)));
                }
            } else if (Snum < Fnum) {
                for (int i = Snum + 1; i <= Fnum; i++) {
                    sum += Math.tan(Math.toRadians(i));
                    System.out.println(Math.tan(Math.toRadians(i)));
                }
            }

            System.out.println("Sum is : " + sum);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error : " + e.getMessage());
        }

    }
}

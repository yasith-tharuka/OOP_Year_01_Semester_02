public class T2Q3 {
    public static void main(String[]args){
        try{
            int Celcius = Integer.parseInt(args[0]);
            double Fha = 1.8 * Celcius + 32;
            System.out.println("The output is:"+Fha);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Not enough Command like Argument/s \nError: "+e.getMessage());
        }
    }
}

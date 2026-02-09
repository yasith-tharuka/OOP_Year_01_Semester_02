

public class Q01 {
    public static void main(String[] args) {
        if(args.length == 0 ){
            System.out.println("Please provide an Input");
            return;
        }
    
        double lkr = Double.parseDouble(args[0]);

        double doller = lkr / 298.26;
        double pound = lkr / 373.74;
        double euro = lkr / 309.36;

        //System.out.printf("%f LKR = %.2f $ \n %f LKR = %.2f Pounds \n %f LKR = %.2f Euros",lkr,doller,lkr,pound,lkr,euro);
        System.out.printf("%.2f LKR = %.2f $ \n%.2f LKR = %.2f Pounds \n%.2f LKR = %.2f Euros", lkr, doller, lkr, pound, lkr, euro);



        
    }
}

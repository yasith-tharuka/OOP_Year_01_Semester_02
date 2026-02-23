

public class Q04 {
    public static void main(String[] args) {

        
        double demandRate =0434;
        double SetupCost =234; 
        double holdingCost =9;

        double EOQ = Math.sqrt((2*demandRate*SetupCost)/holdingCost);
        double TBO = Math.sqrt((2*SetupCost)/demandRate*holdingCost);

        System.out.println("EOQ : " + EOQ + "\n TBO : " + TBO);



    }
}

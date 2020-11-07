public class DiscountRate {
    private static double serviceDiscountPremium=0.2;
    private static double serviceDiscountGold=0.15;
    private static double serviceDiscountSilver=0.1;
    private static double productDiscountPremium=0.1;
    private static double productDiscountGold=0.1;
    private static double productDiscountSilver=0.1;
    
    public static double getServiceDiscountRate(String type){
        double x    ;
        switch(type)
        {
            case "Premium":
                x= serviceDiscountPremium;
                break;
            case "Gold":
                x= serviceDiscountGold;
                break;
            case "Silver":
                x= serviceDiscountSilver;
                break;
            default :
                x=0.1;
        }
        return x;
    }
    public static double getProductDiscountRate(String type){
        double x;
        switch(type)
        {
            case "Premium":
                x= productDiscountPremium;
                break;
            case "Gold":
                x= productDiscountGold;
                break;
            case "Silver":
                x= productDiscountSilver;
                break;
            default :
                x= 0;
                break;
        }
        return x;
    }
}

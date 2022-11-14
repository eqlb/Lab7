public class Site {
    static double TAX_RATE;


    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }

    public double getBaseAmount(){
        return 0.0;
    }
    public double getTaxAmount(){
        return 0.0;
    }

}




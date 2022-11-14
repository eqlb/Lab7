public abstract class Site {
    protected static double TAX_RATE = 0.13;

    public static void main(String[] args){
        System.out.println("Hello world!");
    }


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




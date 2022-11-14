public abstract class Site {
    protected static double TAX_RATE = 0.13;
    protected double base;
    protected double _units;
    protected double _rate;

    public static void main(String[] args){
        System.out.println("Hello world!");
    }


    public abstract double getBillableAmount();

    protected abstract double getBaseAmount();
    protected abstract double getTaxAmount();

}




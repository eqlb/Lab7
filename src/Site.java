public abstract class Site {
    protected static double TAX_RATE = 0.13;
    protected double base;
    protected double _units;
    protected double _rate;

    public double getBillableAmount(){
        return getBaseAmount() + getBaseAmount();
    }

    protected double getBaseAmount(){
        double base = _units * _rate * 0.5;
        return base;
    }
    protected double getTaxAmount(){
        double tax = base * Site.TAX_RATE;
        return tax;
    }

}




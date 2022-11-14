public class ResidentialSite extends Site{


    @Override
    public double getBillableAmount(){
        return base + tax;
    }
    @Override
    protected double getBaseAmount(){
        double base = _units * _rate * 0.5;
        return base;
    }

    @Override
    protected double getTaxAmount(){
        double tax = base * Site.TAX_RATE;
        return tax;
    }


}

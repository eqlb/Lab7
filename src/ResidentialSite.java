public class ResidentialSite extends Site{
    private double base;
    private double _units;
    private double _rate;

    @Override
    public double getBillableAmount(){
        double base = getBaseAmount();
        double tax = getTaxAmount();
        return base + tax;
    }

    private double getBaseAmount(){
        double base = _units * _rate * 0.5;
        return base;
    }

    private double getTaxAmount(){
        double tax = base * Site.TAX_RATE;
        return tax;
    }


}

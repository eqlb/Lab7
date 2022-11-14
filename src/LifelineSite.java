public class LifelineSite extends Site{

    private double _rate;
    private double _units;

    @Override
    protected double getTaxAmount(){
        return 0;
    }

    @Override
    protected double getBaseAmount(){
        return 0;
    }
    public double getBillableAmount(){
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }

}

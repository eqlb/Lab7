public class LifelineSite extends Site{
    private double _rate;
    private double _units;



    public double getBillableAmount(){
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }

}

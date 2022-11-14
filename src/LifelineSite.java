public class LifelineSite extends Site{


    @Override
    public double getBillableAmount(double _units, double _rate){
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }

}

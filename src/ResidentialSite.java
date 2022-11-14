public class ResidentialSite extends Site{


    @Override
    public double getBillableAmount(double _units, double _rate){
        double base = getBaseAmount(_units, _rate);
        double tax = getTaxAmount(base);
        return base + tax;
    }

    private static double getBaseAmount(double _units, double _rate){
        double base = _units * _rate * 0.5;
        return base;
    }

    private static double getTaxAmount(double base){
        double tax = base * Site.TAX_RATE;
        return base;
    }


}

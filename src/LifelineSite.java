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


}

package DecoratorPattern.Coffee;

public class Decaff extends Beverage {

    public Decaff() {
        description = "디카페인";
    }

    @Override
    public double cost() {
        return 0.3;
    }
}

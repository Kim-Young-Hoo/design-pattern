package DecoratorPattern.Coffee;

public class Decaff extends Beverage {

    public Decaff() {
        description = "๋์นดํ์ธ";
    }

    @Override
    public double cost() {
        return 0.3;
    }
}

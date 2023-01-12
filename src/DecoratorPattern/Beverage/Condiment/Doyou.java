package DecoratorPattern.Beverage.Condiment;

import DecoratorPattern.Beverage.Coffee.Beverage;

public class Doyou extends CondimentDecorator{

    public Doyou(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "유두";
    }
}

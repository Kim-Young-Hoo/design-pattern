package DecoratorPattern.Beverage.Condiment;

import DecoratorPattern.Beverage.Coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}

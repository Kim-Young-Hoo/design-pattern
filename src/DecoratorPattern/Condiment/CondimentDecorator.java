package DecoratorPattern.Condiment;

import DecoratorPattern.Coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}

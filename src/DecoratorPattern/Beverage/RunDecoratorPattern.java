package DecoratorPattern.Beverage;

import DecoratorPattern.Beverage.Coffee.Beverage;
import DecoratorPattern.Beverage.Coffee.DarkRoast;
import DecoratorPattern.Beverage.Coffee.HouseBlend;
import DecoratorPattern.Beverage.Condiment.Milk;
import DecoratorPattern.Beverage.Condiment.Mocha;
import DecoratorPattern.Beverage.Condiment.Whip;

public class RunDecoratorPattern {
    public static void main(String[] args) {
        Beverage bevarage = new DarkRoast();
        bevarage = new Milk(bevarage);
        bevarage = new Mocha(bevarage);

        System.out.println(bevarage.getDescription());
        System.out.println(bevarage.cost());
    }
}

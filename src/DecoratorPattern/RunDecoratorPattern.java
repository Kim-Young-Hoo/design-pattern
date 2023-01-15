package DecoratorPattern;

import DecoratorPattern.Coffee.Beverage;
import DecoratorPattern.Coffee.DarkRoast;
import DecoratorPattern.Condiment.Milk;
import DecoratorPattern.Condiment.Mocha;

public class RunDecoratorPattern {
    public static void main(String[] args) {
        Beverage bevarage = new DarkRoast();
        bevarage = new Milk(bevarage);
        bevarage = new Mocha(bevarage);

        System.out.println(bevarage.getDescription());
        System.out.println(bevarage.cost());
    }
}

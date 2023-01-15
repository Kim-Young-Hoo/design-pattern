package FactoryMethodPattern.PizzaStore;

import FactoryMethodPattern.Pizza.NyStyleCheesePizza;
import FactoryMethodPattern.Pizza.NyStyleMeatPizza;
import FactoryMethodPattern.Pizza.NyStylePepperoniPizza;
import FactoryMethodPattern.Pizza.Pizza;

public class NyStylePizzaStore extends PizzaStore {

    // 구상 메소드에서는 각 팩토리가 가진 로직대로의 객체를 반환한다.
    @Override
    public Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new NyStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NyStylePepperoniPizza();
        } else if (type.equals("meat")) {
            return new NyStyleMeatPizza();
        } else return null;
    }
}

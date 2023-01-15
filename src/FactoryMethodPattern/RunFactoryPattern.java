package FactoryMethodPattern;

import FactoryMethodPattern.Pizza.Pizza;
import FactoryMethodPattern.PizzaStore.NyStylePizzaStore;
import FactoryMethodPattern.PizzaStore.PizzaStore;

public class RunFactoryPattern {
    public static void main(String[] args) {

        PizzaStore nyStylePizzaStore = new NyStylePizzaStore();
        Pizza pizza = nyStylePizzaStore.orderPizza("cheese");


    }
}

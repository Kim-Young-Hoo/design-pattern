package FactoryMethodPattern.PizzaStore;

import FactoryMethodPattern.Pizza.Pizza;

public abstract class PizzaStore {

    // orderPizza는 클라이언트이다. 얘는 어떤 피자르 받는지 관심 없다.
    // 단지 prepare, bake, cut, box의 동일한 행동을 하게 강제되어 진다.
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // 이게 바로 팩토리 메소드임
    // createPizza() 메소드가 추상메소드로 설정됨에 따라 서브클래스들에서 생성을 전담해야 한다.
    // 이로 인해서 클라이언트인 orderPizza() 메소드에서는 실제로 어떤 Pizza 객체들이 생성되는지를 몰라도 된다.
    protected abstract Pizza createPizza(String type);

}

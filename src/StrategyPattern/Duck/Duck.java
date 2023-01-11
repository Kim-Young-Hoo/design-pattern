package StrategyPattern.Duck;

import StrategyPattern.Behaviors.IFlyBehavior;
import StrategyPattern.Behaviors.IQuackBehavior;

public abstract class Duck {

    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public Duck() {
    }

    // 모든 오리는 반드시 헤엄치기 때문에 클래스 메소드로
    public void swim() {
        System.out.println("헤엄침");
    }

    // 각 오리마다 무조건 생김새가 다르게 구현되어야 하기 때문에 추상 메소드로
    public abstract void display();

    // 직접 fly()하지 않고 flyBehavior를 위임받아 난다. 이를 구성(composition)이라 함.
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    // setter를 두고 실행단계에서 동적으로 행동 변화가 가능하게끔 한다.
    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

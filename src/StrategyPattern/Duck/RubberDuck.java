package StrategyPattern.Duck;

import StrategyPattern.Behaviors.FlyNoWay;
import StrategyPattern.Behaviors.QuackSqueak;

public class RubberDuck extends Duck{

    // quack, fly 행동을 위임한다.
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackSqueak();
    }

    @Override
    public void display() {
        System.out.println("고무 오리임");
    }
}

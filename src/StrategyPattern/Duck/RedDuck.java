package StrategyPattern.Duck;

import StrategyPattern.Behaviors.FlyWithWings;
import StrategyPattern.Behaviors.QuackNormal;

public class RedDuck extends Duck {

    // quack, fly 행동을 위임한다.
    public RedDuck() {
        quackBehavior = new QuackNormal();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("빨간색 오리임");
    }
}

package StrategyPattern;

import StrategyPattern.Behaviors.FlyNoWay;
import StrategyPattern.Duck.Duck;
import StrategyPattern.Duck.RedDuck;
import StrategyPattern.Duck.RubberDuck;

public class RunStrategyPattern {
    public static void main(String[] args) {

        Duck redDuck = new RedDuck();
        Duck rubberDuck = new RubberDuck();

        // 빨간오리 테스트
        redDuck.display();
        redDuck.swim();
        redDuck.performFly();
        redDuck.performQuack();

        // 고무오리 테스트
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        // 오리 Setter로 행동 변경 테스트
        redDuck.setFlyBehavior(new FlyNoWay());
        redDuck.performFly(); // 못 난다

    }
}

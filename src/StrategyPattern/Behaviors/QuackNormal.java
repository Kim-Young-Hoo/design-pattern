package StrategyPattern.Behaviors;

public class QuackNormal implements IQuackBehavior{

    @Override
    public void quack() {
        System.out.println("평범하게 꽥꽥");
    }
}

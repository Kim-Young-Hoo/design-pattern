package StrategyPattern.Behaviors;

public class QuackSqueak implements IQuackBehavior{
    @Override
    public void quack() {
        System.out.println("삑삑삑 소리");
    }
}

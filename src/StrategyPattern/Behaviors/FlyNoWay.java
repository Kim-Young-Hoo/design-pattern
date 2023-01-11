package StrategyPattern.Behaviors;

public class FlyNoWay implements IFlyBehavior{

    @Override
    public void fly() {
        System.out.println("못 난다");
    }
}

package StrategyPattern.Behaviors;

public class FlyWithWings implements IFlyBehavior{

    @Override
    public void fly() {
        System.out.println("날개로 난다");
    }
}

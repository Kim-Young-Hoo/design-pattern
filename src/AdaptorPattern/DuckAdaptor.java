package AdaptorPattern;

public class DuckAdaptor implements Turkey{

    Duck duck;

    public DuckAdaptor(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            duck.fly();
        }
    }
}

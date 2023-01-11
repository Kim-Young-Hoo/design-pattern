package ObserverPattern.Observer;

public interface IObserver {

    // push 방식
    void update(int temperature, int humidity, int pressure);

    // pool 방식
//    void update();

}

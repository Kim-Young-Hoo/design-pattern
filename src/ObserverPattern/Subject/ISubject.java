package ObserverPattern.Subject;

import ObserverPattern.Observer.IObserver;

public interface ISubject {

    void registerObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObserver();
}

package BehaviorDP.ObserverDP.StockObservable;
import BehaviorDP.ObserverDP.AlertObserver.AlertObserverInterface;
import BehaviorDP.ObserverDP.AlertObserver.AlertObserverInterface;

public interface StockInterface {
    public void add(AlertObserverInterface observer);
    public void remove(AlertObserverInterface observer);

    public void notifySubscriber();
    public void setStock(int newstockadded);
    public int getStock();

}

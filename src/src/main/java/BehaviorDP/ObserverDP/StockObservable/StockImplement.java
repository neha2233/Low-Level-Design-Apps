package BehaviorDP.ObserverDP.StockObservable;
import java.util.*;
import BehaviorDP.ObserverDP.AlertObserver.AlertObserverInterface;

public class StockImplement implements StockInterface{

    List<AlertObserverInterface> observer=new ArrayList<>();
    public int stock;

    @Override
    public void  add(AlertObserverInterface obj){
        observer.add(obj);
    }

    @Override
    public void remove(AlertObserverInterface obj){
        observer.remove(obj);
    }

    @Override
    public void notifySubscriber() {
        for(AlertObserverInterface obj:observer){
            obj.update();
        }
    }

    @Override
    public void setStock(int newstockadded) {

        if(stock==0)
            notifySubscriber();

        stock=stock+newstockadded;

    }

    @Override
    public int getStock() {
        return stock;
    }


}
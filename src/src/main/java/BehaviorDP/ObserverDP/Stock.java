package BehaviorDP.ObserverDP;

import BehaviorDP.ObserverDP.AlertObserver.EmailNotificationObserver;
import BehaviorDP.ObserverDP.AlertObserver.SMSNotificationObserver;
import BehaviorDP.ObserverDP.StockObservable.StockImplement;
import BehaviorDP.ObserverDP.StockObservable.StockInterface;

public class Stock {
    public static void main(String[] args){

        StockInterface observable=new StockImplement();

        EmailNotificationObserver observer1=new EmailNotificationObserver(observable, "xyz@.com");
        EmailNotificationObserver observer2=new EmailNotificationObserver(observable, "pqr@.com");

        SMSNotificationObserver observer3=new SMSNotificationObserver(observable,"493882374");
        SMSNotificationObserver observer4=new SMSNotificationObserver(observable,"847892349");

        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);
        observable.add(observer4);


        observable.setStock(10);

    }

}
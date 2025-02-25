package BehaviorDP.ObserverDP.AlertObserver;

import BehaviorDP.ObserverDP.StockObservable.StockInterface;

public class SMSNotificationObserver implements AlertObserverInterface {
    StockInterface Observable;
    String number;

    public SMSNotificationObserver(StockInterface obsrval,String num){
        this.Observable=obsrval;
        this.number=num;
    }
    @Override
    public void update() {
        sendSMS(number,"Product is back");
    }

    public void sendSMS(String number,String msg){
        System.out.println("SMS send to : "+number);
    }
}

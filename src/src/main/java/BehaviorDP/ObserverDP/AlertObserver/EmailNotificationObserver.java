package BehaviorDP.ObserverDP.AlertObserver;

import BehaviorDP.ObserverDP.StockObservable.StockInterface;

import java.util.ArrayList;
import java.util.List;

public class EmailNotificationObserver implements AlertObserverInterface {

    StockInterface observable;
    public String email;

    public EmailNotificationObserver(StockInterface obj,String email){
        this.email=email;
        this.observable=obj;
    }



    public void sendEmail(String email,String msg){
        System.out.println("email send to:"+email);
    }

    @Override
    public void update() {
        sendEmail(email,"Product is in stock");
    }
}
package com.library.pattern.observer;
public class PatronNotifier implements Observer {
    public void update(String message){ System.out.println("Notification: "+message); }
}
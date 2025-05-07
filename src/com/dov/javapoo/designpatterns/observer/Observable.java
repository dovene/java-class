package com.dov.javapoo.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;


public class Observable {
    private List<Observer> observers = new ArrayList<>();
    public void registerObserver(Observer observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
    public void stateChanged() {
        notifyObservers();
    }
}
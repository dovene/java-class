package com.dov.javapoo.designpatterns.observer;

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("ConcreteObserver notified of state changed.");
    }
    
}

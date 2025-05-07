package com.dov.javapoo.designpatterns.observer;

public class AnotherConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("AnotherConcreteObserver notified of state changed.");
    }
    
}

package com.dov.javapoo.designpatterns.observer;

public class ObserverMain {

    public static void main(String[] args) {
        // Create an observable object
        Observable observable = new Observable();
        // Create some observers
        Observer observer = new ConcreteObserver();
        AnotherConcreteObserver anotherConcreteObserver = new AnotherConcreteObserver();
        // Register observers
        observable.registerObserver(observer);
        observable.registerObserver(anotherConcreteObserver);
        // Simulate a state change in the observable
        observable.stateChanged();
    }
}
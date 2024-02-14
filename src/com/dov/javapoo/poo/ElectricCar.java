package com.dov.javapoo.poo;

public class ElectricCar extends Car {
    private int batteryLevel;

    public ElectricCar(String brand, String model, int batteryLevel) {
        super(brand, model);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void start() {
        System.out.println("Démarrage de la : "+getBrand() + " "+ getModel() +"et le niveau d'énergie est " + batteryLevel);
    }

    @Override
    public void stop() {
        System.out.println("Arrêt de la "+getBrand() +" "+ getModel()+"et le niveau d'énergie est " + batteryLevel);
    }
}

package com.dov.javapoo.poo;

public class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void start() {
        System.out.println("Démarrage de la : "+getBrand() + " "+ getModel());
    }

    public void stop() {
        System.out.println("Arrêt de la "+getBrand() +" "+ getModel());
    }

    public void display() {
        System.out.println(getBrand() +" "+ getModel());
    }
}

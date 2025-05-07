package com.dov.javapoo.improvedcar;

public abstract class ImprovedVehicle {
    protected String brand;
    protected int maxSpeed;
    protected double price;
    
    public ImprovedVehicle(String brand, int maxSpeed, double price) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }
    
    // Méthode abstraite à implémenter par les sous-classes
    public abstract double calculateTax();
    
    // Getters et setters
    public String getBrand() {
        return brand;
    }
    
    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    public double getPrice() {
        return price;
    }
    
 
    public String getInformations() {
        return "Marque: " + brand + ", Vitesse maximale: " + maxSpeed + " km/h, Prix: " + price + " €";
    }
}

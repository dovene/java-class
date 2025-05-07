package com.dov.javapoo.improvedcar;

public class ImprovedCar extends ImprovedVehicle implements ImprovedMaintenance {
    private String fuelType;
    
    public ImprovedCar(String brand, int maxSpeed, double price, String fuelType) {
        super(brand, maxSpeed, price);
        this.fuelType = fuelType;
    }
    
    @Override
    public double calculateTax() {
        return price * 0.20; // 20% du prix
    }
    
    @Override
    public double getMaintenanceCost() {
        return 500; // Coût de maintenance fixe
    }
    
    @Override
    public int getMaintenanceInterval() {
        return 12; // Tous les 12 mois
    }
    
    public String getFuelType() {
        return fuelType;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Type de carburant: " + fuelType + 
               ", Taxe: " + calculateTax() + " €, Coût de maintenance: " + 
               getMaintenanceCost() + " €, Intervalle de maintenance: " + 
               getMaintenanceInterval() + " mois";
    }
}

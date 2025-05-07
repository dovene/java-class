package com.dov.javapoo.improvedcar;

public class ImprovedMotorCycle extends ImprovedVehicle implements ImprovedMaintenance {
    private String engineType;
    
    public ImprovedMotorCycle(String brand, int maxSpeed, double price, String engineType) {
        super(brand, maxSpeed, price);
        this.engineType = engineType;
    }
    
    @Override
    public double calculateTax() {
        return price * 0.15; // 15% du prix
    }
    
    @Override
    public double getMaintenanceCost() {
        return 200; // Coût de maintenance fixe
    }
    
    @Override
    public int getMaintenanceInterval() {
        return 6; // Tous les 6 mois
    }
    
    public String getEngineType() {
        return engineType;
    }
    
    @Override
    public String getInformations() {
        return super.toString() + ", Type de moteur: " + engineType +
               ", Taxe: " + calculateTax() + " €, Coût de maintenance: " + 
               getMaintenanceCost() + " €, Intervalle de maintenance: " + 
               getMaintenanceInterval() + " mois";
    }
}

package com.dov.javapoo.poo.cardealer;

import java.time.LocalDateTime;

public class Car {
    private String idNumber;
    private String model;
    private String brand;
    private int yearOfSale;
    private int price;

    public static String leastPolluting = "Moins polluant";
    public static String polluting = "Polluant";
    public static String mostPolluting = "Très polluant";

    public Car(String idNumber, String brand, String model, int yearOfSale, int price) {
        this.idNumber = idNumber;
        this.model = model;
        this.brand = brand;
        this.yearOfSale = yearOfSale;
        this.price = price;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfSale() {
        return yearOfSale;
    }

    public void setYearOfSale(int yearOfSale) {
        this.yearOfSale = yearOfSale;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInformation() {
        return String.format(" voiture :%s, marque : %s, modèle : %s, année : %s, prix :%s, ", idNumber, brand, model, yearOfSale, price);
    }


    public String getPollutionLevel() {
        int age = getCarAge();
        if (age < 5) {
            return leastPolluting;
        } else if (age < 10) {
            return polluting;
        } else {
            return mostPolluting;
        }
    }

    public int getCarAge() {
        return LocalDateTime.now().getYear() - getYearOfSale();
    }

}

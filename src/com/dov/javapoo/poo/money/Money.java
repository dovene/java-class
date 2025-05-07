package com.dov.javapoo.poo.money;

public class Money {
    private String name;
    private float exchangeRate;

    public Money(String name, float exchangeRate) {
        this.name = name;
        this.exchangeRate = exchangeRate;
    }

    public String getName() {
        return name;
    }

    public float getExchangeRate() {
        return exchangeRate;
    }

    public String getInformations() {
        return " devise : "+ name + ", taux : " + exchangeRate;
    }


}

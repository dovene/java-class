package com.dov.javapoo.poo.form;

public class Cercle extends Form {

    private double radius;

    public Cercle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String getPerimeter() {
        return "Le périmère du cercle de coleur " + getColor() + " est " + 2 * radius * Math.PI;
    }
}

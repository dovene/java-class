package com.dov.javapoo.poo.form;

public class Rectangle extends Form {

    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String getPerimeter() {
        return "Le périmère du rectangle de coleur " + getColor() + " est " + 2 * (length + width);
    }
}

package com.dov.javapoo.poo.form;

public abstract class Form {
    private String color;

    public Form(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract String getPerimeter();
}

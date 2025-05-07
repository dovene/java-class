package com.dov.javapoo.designpatterns.factory.mould;

public class MouldB implements Mould {
    @Override
    public String getColor() {
        return "rouge";
    }

    @Override
    public String getShape() {
        return "losange";
    }

    @Override
    public String getInformation() {
        return "Moule B: " + getColor() + ", " + getShape();
    }
}

package com.dov.javapoo.designpatterns.factory.mould;

public class MouldD implements Mould {
    @Override
    public String getColor() {
        return "gris";
    }

    @Override
    public String getShape() {
        return "rond";
    }

    @Override
    public String getInformation() {
        return "Moule D: " + getColor() + ", " + getShape();
    }
}

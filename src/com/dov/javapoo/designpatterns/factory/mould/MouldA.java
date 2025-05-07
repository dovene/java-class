package com.dov.javapoo.designpatterns.factory.mould;

public class MouldA implements Mould {

    @Override
    public String getColor() {
        return "rouge";
    }

    @Override
    public String getShape() {
        return "carré";
    }

    @Override
    public String getInformation() {
        return "Moule A: " + getColor() + ", " + getShape();
    }
    
}

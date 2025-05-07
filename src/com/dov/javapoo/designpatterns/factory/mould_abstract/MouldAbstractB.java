package com.dov.javapoo.designpatterns.factory.mould_abstract;

public class MouldAbstractB extends MouldBase {
    
    public MouldAbstractB(String color, String shape) {
        super(color, shape);
    }

    @Override
    public String getInformation() {
        return "Moule B: " + getColor() + ", " + getShape();
    }
}

package com.dov.javapoo.designpatterns.factory.mould_abstract;

public class MouldAbstractD extends MouldBase {

    public MouldAbstractD(String color, String shape) {
        super(color, shape);
    }

    @Override
    public String getInformation() {
        return "Moule D: " + getColor() + ", " + getShape();
    }
    
}

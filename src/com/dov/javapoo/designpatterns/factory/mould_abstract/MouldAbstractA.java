package com.dov.javapoo.designpatterns.factory.mould_abstract;

public class MouldAbstractA extends MouldBase {

    public MouldAbstractA(String color, String shape) {
        super(color, shape);
    }

    @Override
    public String getInformation() {
        return "Moule A: " + super.getInformation();
    }
    
}

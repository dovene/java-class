package com.dov.javapoo.designpatterns.factory.mould_abstract;

public class MouldAbstractC extends MouldBase {

    String additionalInfo = "vendu uniquement aux grossistes";

    public MouldAbstractC(String color, String shape) {
        super(color, shape);
    }

    @Override
    public String getInformation() {
        return "Moule C: " + getColor() + ", " + getShape() + additionalInfo;
    }
    
}

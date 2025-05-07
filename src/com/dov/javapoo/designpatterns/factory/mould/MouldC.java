package com.dov.javapoo.designpatterns.factory.mould;

public class MouldC implements Mould {
    String additionalInfo = "vendu uniquement aux grossistes";

    @Override
    public String getColor() {
        return "vert";
    }

    @Override
    public String getShape() {
        return "triangle";
    }


    @Override
    public String getInformation() {
        return "Moule C: " + getColor() + ", " + getShape() + additionalInfo;
    }
}

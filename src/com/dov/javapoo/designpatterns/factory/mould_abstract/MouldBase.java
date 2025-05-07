package com.dov.javapoo.designpatterns.factory.mould_abstract;
import com.dov.javapoo.designpatterns.factory.mould.Mould;

public abstract class MouldBase implements Mould {

    public String color;
    private String shape;

    public MouldBase(String color, String shape) {
        this.color = color;
        this.shape = shape;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getShape() {
        return shape;
    }

    @Override
    public String getInformation() {
        return  getColor() + ", " + getShape();
    }
    
}

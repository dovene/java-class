package com.dov.javapoo.designpatterns.factory.mould_abstract;

public class MouldAbstractFactory {
    
    public static MouldBase createMould(String type) {
        switch (type) {
            case "A":
                return new MouldAbstractA("rouge", "carré");
            case "B":
                return new MouldAbstractB("rouge", "losange");
            case "C":
                return new MouldAbstractC("vert", "triangle");
             case "D":
                return new MouldAbstractD("jaune", "rond");
            default:
                throw new IllegalArgumentException("Type de moule inconnu : " + type);
        }
    }
}

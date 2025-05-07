package com.dov.javapoo.designpatterns.factory.mould;

public class MouldFactory {
    
    public static Mould createMould(String type) {
        switch (type) {
            case "A":
                return new MouldA();
            case "B":
                return new MouldB();
            case "D":
                return new MouldD();
            case "C":
                return new MouldC();
            default:
                throw new IllegalArgumentException("Type de moule inconnu : " + type);
        }
    }
}

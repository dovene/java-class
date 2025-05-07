package com.dov.javapoo.designpatterns.factory.mould_abstract;

public class MouldAbstractMain {
    
    public static void main(String[] args) {
        MouldBase mouldA = MouldAbstractFactory.createMould("A");
        MouldBase mouldB = MouldAbstractFactory.createMould("B");
        MouldBase mouldC = MouldAbstractFactory.createMould("C");

        System.out.println(mouldA.getInformation());
        System.out.println(mouldB.getInformation());
        System.out.println(mouldC.getInformation());
    }
}

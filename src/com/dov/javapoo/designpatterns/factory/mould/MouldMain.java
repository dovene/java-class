package com.dov.javapoo.designpatterns.factory.mould;

public class MouldMain {
    
    public static void main(String[] args) {
        Mould mouldA = MouldFactory.createMould("A");
        Mould mouldB = MouldFactory.createMould("B");
        Mould mouldD = MouldFactory.createMould("D");
        Mould mouldC = MouldFactory.createMould("C");

        System.out.println(mouldA.getInformation());
        System.out.println(mouldB.getInformation());
        System.out.println(mouldD.getInformation());
        System.out.println(mouldC.getInformation());
    }
}

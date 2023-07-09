package org.abhishek.design.pattern.factory.abstractfactory.vehicel.models;

public class BMW extends Vehicle {
    @Override
    public int average(){
        System.out.println("average of BMW");
        return 20;
    }
}

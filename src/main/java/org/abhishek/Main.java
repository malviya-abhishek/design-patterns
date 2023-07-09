package org.abhishek;


import org.abhishek.design.pattern.decorater.DecoratorPattern;
import org.abhishek.design.pattern.factory.abstractfactory.AbstractFactoryPattern;
import org.abhishek.design.pattern.factory.abstractfactory.vehicel.AbstractVehicleFactory;
import org.abhishek.design.pattern.factory.factory.FactoryPattern;

public class Main {
    public static void main(String[] args) {

        DecoratorPattern decoratorPattern = new DecoratorPattern();
//        decoratorPattern.solve();

        FactoryPattern factoryPattern = new FactoryPattern();
//        factoryPattern.solve();


        AbstractFactoryPattern abstractFactoryPattern = new AbstractFactoryPattern();
        abstractFactoryPattern.solve();



    }
}
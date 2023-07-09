package org.abhishek.design.pattern.factory.abstractfactory.vehicel;

import org.abhishek.design.pattern.factory.abstractfactory.vehicel.factory.LuxuryVehicleFactory;
import org.abhishek.design.pattern.factory.abstractfactory.vehicel.factory.NormalVehicleFactory;
import org.abhishek.design.pattern.factory.abstractfactory.vehicel.factory.VehicleFactory;

public class AbstractVehicleFactory {

    public VehicleFactory getVehicleFactory(String input){
        switch (input) {
            case "Luxury" -> {
                return new LuxuryVehicleFactory();
            }
            case "Normal" -> {
                return new NormalVehicleFactory();
            }
            default -> throw new Error("Invalid factory type");
        }
    }

}

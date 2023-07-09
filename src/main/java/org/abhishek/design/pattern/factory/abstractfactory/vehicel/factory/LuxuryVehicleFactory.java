package org.abhishek.design.pattern.factory.abstractfactory.vehicel.factory;

import org.abhishek.design.pattern.factory.abstractfactory.vehicel.models.Audi;
import org.abhishek.design.pattern.factory.abstractfactory.vehicel.models.BMW;
import org.abhishek.design.pattern.factory.abstractfactory.vehicel.models.Vehicle;

public class LuxuryVehicleFactory extends VehicleFactory {
    @Override
    public Vehicle getVehicle(String input) {
        switch (input) {
            case "BMW" -> {
                return new BMW();
            }
            case "Audi" -> {
                return new Audi();
            }
            default -> throw new Error("Invalid Luxury Vehicle type");
        }
    }
}

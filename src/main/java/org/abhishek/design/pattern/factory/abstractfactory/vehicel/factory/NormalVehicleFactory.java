package org.abhishek.design.pattern.factory.abstractfactory.vehicel.factory;

import org.abhishek.design.pattern.factory.abstractfactory.vehicel.models.Swift;
import org.abhishek.design.pattern.factory.abstractfactory.vehicel.models.Vehicle;
import org.abhishek.design.pattern.factory.abstractfactory.vehicel.models.Verna;

import java.lang.invoke.VarHandle;

public class NormalVehicleFactory extends VehicleFactory {
    @Override
    public Vehicle getVehicle(String input) {
        switch (input) {
            case "Swift" -> {
                return new Swift();
            }
            case "Verna" -> {
                return new Verna();
            }
            default -> throw new Error("Invalid Normal Vehicle type");
        }
    }
}

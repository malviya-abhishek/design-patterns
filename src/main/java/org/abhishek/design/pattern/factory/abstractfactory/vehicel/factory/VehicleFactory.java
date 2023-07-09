package org.abhishek.design.pattern.factory.abstractfactory.vehicel.factory;

import org.abhishek.design.pattern.factory.abstractfactory.vehicel.models.Vehicle;

abstract public class VehicleFactory {
    abstract public Vehicle getVehicle(String input);
}

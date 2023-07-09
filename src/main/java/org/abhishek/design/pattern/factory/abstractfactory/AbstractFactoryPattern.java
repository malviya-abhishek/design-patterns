package org.abhishek.design.pattern.factory.abstractfactory;

import org.abhishek.design.pattern.factory.abstractfactory.vehicel.AbstractVehicleFactory;
import org.abhishek.design.pattern.factory.abstractfactory.vehicel.factory.LuxuryVehicleFactory;
import org.abhishek.design.pattern.factory.abstractfactory.vehicel.factory.VehicleFactory;
import org.abhishek.design.pattern.factory.abstractfactory.vehicel.models.Audi;
import org.abhishek.design.pattern.factory.abstractfactory.vehicel.models.BMW;
import org.abhishek.design.pattern.factory.abstractfactory.vehicel.models.Vehicle;

/**
 * Abstract factory is a factory of factory
 */

public class AbstractFactoryPattern {

    public void solve(){
        AbstractVehicleFactory abstractVehicleFactory = new AbstractVehicleFactory();
        VehicleFactory normalVehicleFactory = abstractVehicleFactory.getVehicleFactory("Normal");
        VehicleFactory luxuryVehicleFactory = abstractVehicleFactory.getVehicleFactory("Luxury");

        Vehicle verna = normalVehicleFactory.getVehicle("Verna");
        Vehicle swift = normalVehicleFactory.getVehicle("Swift");

        Vehicle BMW = luxuryVehicleFactory.getVehicle("BMW");
        Vehicle audi = luxuryVehicleFactory.getVehicle("Audi");


        verna.average();
        swift.average();
        BMW.average();
        audi.average();


    }

}

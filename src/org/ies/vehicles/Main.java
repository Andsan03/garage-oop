package org.ies.vehicles;

import org.ies.vehicles.model.Garage;
import org.ies.vehicles.model.Vehicle;
import org.ies.vehicles.model.VehicleType;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(
                "azul",
                "SAS7F3",
                200,
                VehicleType.Car
        );

        Vehicle vehicle2 = new Vehicle(
                "rojo",
                "FYG793",
                220,
                VehicleType.Motorbike
        );

        Vehicle vehicle3 = new Vehicle(
                "negro",
                "8DFV29",
                150,
                VehicleType.Truck
        );

        Vehicle[] vehicles = {vehicle1,vehicle2,vehicle3};

        Garage garage = new Garage(
                "C/Pepe 3",
                "Opel",
                vehicles
        );

        System.out.println(garage);

    }
}
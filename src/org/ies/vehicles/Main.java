package org.ies.vehicles;

import org.ies.vehicles.components.VehicleReader;
import org.ies.vehicles.model.Garage;
import org.ies.vehicles.model.Vehicle;
import org.ies.vehicles.model.VehicleType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleReader vehicleReader = new VehicleReader(scanner);
        Vehicle vehicle1 = vehicleReader.read();

        Vehicle vehicle2 = vehicleReader.read();

        Vehicle vehicle3 = vehicleReader.read();

        Vehicle[] vehicles = {vehicle1,vehicle2,vehicle3};

        Garage garage = new Garage(
                "C/Pepe 3",
                "Opel",
                vehicles
        );

        System.out.println(garage);

    }
}
package org.ies.vehicles.components;

import org.ies.vehicles.model.Garage;
import org.ies.vehicles.model.Vehicle;

import java.util.Scanner;

public class GarageReader {
    private final Scanner scannner;
    private final VehicleReader vehicleReader;

    public GarageReader(Scanner scannner, VehicleReader vehicleReader) {
        this.scannner = scannner;
        this.vehicleReader = vehicleReader;
    }
    public Garage read() {
        System.out.println("Escribe los datos del garaje");
        System.out.println("Nombre:");
        String name = scannner.nextLine();
        System.out.println("Direccion:");
        String direction = scannner.nextLine();
        System.out.println("Cuantos vehiculos tendra?");
        int size = scannner.nextInt();

        Vehicle[] vehicles = new Vehicle[size];

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i] = vehicleReader.read();
        }
        return new Garage(
                name,
                direction,
                vehicles
        );
    }
}

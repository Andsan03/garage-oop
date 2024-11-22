package org.ies.vehicles.model;

import java.util.Arrays;
import java.util.Objects;

public class Garage {
    private String name;
    private String direction;
    private String[] vehicles;

    public Garage(String direction, String name, String[] vehicles) {
        this.direction = direction;
        this.name = name;
        this.vehicles = vehicles;
    }

    public String getDirection() {
        return direction;
    }

    public String getName() {
        return name;
    }

    public String[] getVehicles() {
        return vehicles;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVehicles(String[] vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return Objects.equals(name, garage.name) && Objects.equals(direction, garage.direction) && Objects.deepEquals(vehicles, garage.vehicles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, direction, Arrays.hashCode(vehicles));
    }

    @Override
    public String toString() {
        return "Garage{" +
                "direction='" + direction + '\'' +
                ", name='" + name + '\'' +
                ", vehicles=" + Arrays.toString(vehicles) +
                '}';
    }
}

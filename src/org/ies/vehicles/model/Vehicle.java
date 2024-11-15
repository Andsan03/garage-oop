package org.ies.vehicles.model;

import java.util.Objects;

public class Vehicle {
    private VehicleType vehicleType;
    private int maxVel;
    private String color;
    private String matricula;

    public Vehicle(String color, String matricula, int maxVel, VehicleType vehicleType) {
        this.color = color;
        this.matricula = matricula;
        this.maxVel = maxVel;
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getMaxVel() {
        return maxVel;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMaxVel(int maxVel) {
        this.maxVel = maxVel;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", vehicleType=" + vehicleType +
                ", maxVel=" + maxVel +
                ", matricula='" + matricula + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return maxVel == vehicle.maxVel && vehicleType == vehicle.vehicleType && Objects.equals(color, vehicle.color) && Objects.equals(matricula, vehicle.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleType, maxVel, color, matricula);
    }
}


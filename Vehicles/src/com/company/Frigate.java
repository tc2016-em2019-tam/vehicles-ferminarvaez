package com.company;
import java.lang.String;

public class Frigate extends Vehicle implements SeaVessel {
    private double Displacement;

    public Frigate(String name, int maxPassengers, double maxSpeed, double displacement) {
        super(name);
        Displacement = displacement;
    }

    public Frigate(String name) {
        super(name);
        Displacement = Displacement;
    }

    @Override
    public double getDisplacement() {
        return Displacement;
    }

    @Override
    public void setDisplacement(double Displacement) {
        this.Displacement = Displacement;
    }

    @Override
    public void launch() {
        System.out.println("Calling launch() method!");
    }

    public void fireGun() {
        System.out.println("hola");
    }
}

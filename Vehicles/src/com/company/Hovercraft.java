package com.company;
import java.lang.String;

public class Hovercraft extends Vehicle implements LandVehicle, SeaVessel {
    private int numWheels;
    private double Displacement;

    public Hovercraft(String name, int maxPassengers, double maxSpeed, int numWheels, double displacement) {
        super(name);
        this.numWheels = numWheels;
        Displacement = displacement;
    }

    public Hovercraft(String name) {
        super(name);
        this.numWheels = numWheels;
        Displacement = Displacement;
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public void drive() {
        System.out.println("Calling drive() method!");
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

    public void EnterLand(){
        System.out.println("Hovercraft entering land!");
    }

    public void EnterSea(){
        System.out.println("Hovercraft entering sea!");
    }
}

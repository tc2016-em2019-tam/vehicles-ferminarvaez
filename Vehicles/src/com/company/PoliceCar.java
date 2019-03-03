package com.company;

public class PoliceCar extends Vehicle implements LandVehicle, Emergency {
    private int numWheels;

    public PoliceCar(String name, int maxPassengers, double maxSpeed) {
        super(name);
    }

    public PoliceCar(String name) {
        super(name);
    }

    @Override
    public void soundSiren() {
        System.out.println("hola 2");
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
        System.out.println("Calling drive() method.");
    }

    public void patrol(){
        System.out.println("Calling patrol() method.");
    }
}

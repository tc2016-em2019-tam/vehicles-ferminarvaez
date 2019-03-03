package com.company;

public class Vehicle {
    public String name;
    public int maxPassengers;
    public double maxSpeed;

    public Vehicle(String name) {
        this.name = name;
        this.maxPassengers = this.maxPassengers;
        this.maxSpeed = this.maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

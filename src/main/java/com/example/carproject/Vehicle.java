package com.example.carproject;

public class Vehicle {
    private double weight;
    private double speed;

    public Vehicle(double weight, double speed) {
        this.weight = weight;
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}

package com.example.carproject;

public class Car extends Vehicle {
    private String brand;
    private String model;

    public Car(String brand, String model, double weight, double speed) {
        super(weight, speed);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

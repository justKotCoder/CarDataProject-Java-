package com.example.carproject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarHandler {
    private List<Car> cars = new ArrayList<>();

    public void generateCars(int count) {
        String[] brands = {"Toyota", "Ford", "BMW", "Audi", "Honda"};
        String[] models = {"Model A", "Model B", "Model C", "Model D", "Model E"};
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            String brand = brands[rand.nextInt(brands.length)];
            String model = models[rand.nextInt(models.length)];
            double weight = 1000 + rand.nextDouble() * 1500;
            double speed = 100 + rand.nextDouble() * 150;
            cars.add(new Car(brand, model, weight, speed));
        }
    }

    public double findMaxWeight() {
        double maxWeight = 0;
        for (Car car : cars) {
            if (car.getWeight() > maxWeight) {
                maxWeight = car.getWeight();
            }
        }
        return maxWeight;
    }

    public double findAverageSpeed() {
        double totalSpeed = 0;
        for (Car car : cars) {
            totalSpeed += car.getSpeed();
        }
        return totalSpeed / cars.size();
    }

    public void writeToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Car car : cars) {
                writer.write(car.getBrand() + "," + car.getModel() + "," + car.getWeight() + "," + car.getSpeed());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile(String filename) {
        cars.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String brand = parts[0];
                String model = parts[1];
                double weight = Double.parseDouble(parts[2]);
                double speed = Double.parseDouble(parts[3]);
                cars.add(new Car(brand, model, weight, speed));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}

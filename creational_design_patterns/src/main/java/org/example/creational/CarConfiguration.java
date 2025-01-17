package org.example.creational;

import org.example.creational.builder.Car;

public class CarConfiguration {

    public static void main(String[] args) {
        Car car1 = new Car.Builder()
                .setEngine("V12")
                .setTransmission("Manual")
                .setColor("Blue")
                .setSunroof(true)
                .build();

        System.out.println(car1);
    }
}
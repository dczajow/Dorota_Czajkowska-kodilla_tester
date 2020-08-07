package com.kodilla.collections.interfaces.homework;


import java.util.Random;

public class CarRace {
    public static void doRace(Car car) {
        Random random = new Random();
        int value = random.nextInt(51);
        car.increaseSpeed(value);
        car.increaseSpeed(value);
        car.increaseSpeed(value);
        car.decreaseSpeed();
        car.decreaseSpeed();


        System.out.println(car.getName() + ": " + car.getSpeed());
    }

    public static void main(String[] args) {
        Opel opel = new Opel();
        opel.name = "Opel Astra";

        doRace(opel);

        Subaru subaru = new Subaru();
        subaru.name = "Subaru Forester";

        doRace(subaru);

        Toyota toyota = new Toyota();
        toyota.name = "Toyota Celica";
        doRace(toyota);

    }
}

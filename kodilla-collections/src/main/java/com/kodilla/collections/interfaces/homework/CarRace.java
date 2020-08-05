package com.kodilla.collections.interfaces.homework;


public class CarRace {
    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
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

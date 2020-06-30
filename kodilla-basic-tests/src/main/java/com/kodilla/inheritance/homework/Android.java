package com.kodilla.inheritance.homework;

public class Android extends OperatingSystem {

    public Android(int releaseDate) {
        super(releaseDate);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Android OS turned on");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("Android OS turned off");
    }
}

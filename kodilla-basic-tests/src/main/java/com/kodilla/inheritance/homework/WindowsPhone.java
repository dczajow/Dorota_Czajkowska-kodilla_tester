package com.kodilla.inheritance.homework;

public class WindowsPhone extends OperatingSystem {
    public WindowsPhone(int releaseDate) {
        super(releaseDate);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Windows Phone OS turned on");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("Windows Phone OS turned off");
    }

}

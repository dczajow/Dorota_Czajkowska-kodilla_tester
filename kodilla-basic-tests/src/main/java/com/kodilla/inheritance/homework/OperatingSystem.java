package com.kodilla.inheritance.homework;

public class OperatingSystem {
    public int releaseDate;

    public void turnOn() {
        System.out.println("OS turned on");
    }
    public void turnOff() {
        System.out.println("OS turned off");
    }
    public OperatingSystem(int releaseDate){
        this.releaseDate = releaseDate;
    }
}

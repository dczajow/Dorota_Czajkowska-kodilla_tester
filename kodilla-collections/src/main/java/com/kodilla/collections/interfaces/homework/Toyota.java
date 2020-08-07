package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {
    private int speed = 92;
    public String name;
    int value = 22;

    @Override
    public void increaseSpeed(int value) {
        speed = speed + value;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 10;

    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String getName() {
        return name;
    }
}

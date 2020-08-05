package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {
    private int speed = 0;
    public String name;

    @Override
    public void increaseSpeed() {
        speed = speed + 30;

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

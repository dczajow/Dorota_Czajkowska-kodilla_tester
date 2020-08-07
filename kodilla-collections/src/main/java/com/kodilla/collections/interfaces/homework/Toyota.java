package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {
    private int speed = 0;
    public String name;
    public static int value = 24;

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

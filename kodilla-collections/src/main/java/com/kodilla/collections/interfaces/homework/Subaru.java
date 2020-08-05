package com.kodilla.collections.interfaces.homework;

public class Subaru implements Car {
    private int speed = 0;
    public String name;

    @Override
    public void increaseSpeed() {
        speed = speed + 50;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 20;

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

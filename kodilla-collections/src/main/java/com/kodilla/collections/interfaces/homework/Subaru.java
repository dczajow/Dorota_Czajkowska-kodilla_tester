package com.kodilla.collections.interfaces.homework;

public class Subaru implements Car {
    private int speed = 0;
    public String name;
    public static int value = 50;

    @Override
    public void increaseSpeed(int value) {

        speed = speed + value;
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

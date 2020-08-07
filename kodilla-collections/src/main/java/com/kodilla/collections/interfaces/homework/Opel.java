package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Opel implements Car {

    public String name;
    public int speed = 55;
    int value = 34;

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

package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Opel implements Car {
    Random random = new Random();

    public int speed = random.nextInt(51);
    public String name;

    @Override
    public void increaseSpeed() {
        speed = speed + 30;
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

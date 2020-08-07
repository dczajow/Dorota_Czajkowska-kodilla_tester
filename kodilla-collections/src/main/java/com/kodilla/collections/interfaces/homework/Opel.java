package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Opel implements Car {
    Random random = new Random();

    public int speed = random.nextInt(51);
    public String name;
    public static int value = 30;

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

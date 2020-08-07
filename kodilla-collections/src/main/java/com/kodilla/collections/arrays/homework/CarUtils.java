package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Subaru;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------");
        System.out.println("Car brand: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
    }

    public static String getCarName(Car car) {
        if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Subaru)
            return "Subaru";
        else if (car instanceof Toyota)
            return "Toyota";
        else return "Car unknown";
    }

    }

package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Subaru;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = random.nextInt(15) + 1;

        Car[] cars = new Car[arraySize];
        for(int i = 0; i < cars.length; i++)
            cars[i] = drawCar();

        for(Car auto : cars) {
            CarUtils.describeCar(auto);
            CarUtils.getFaster(auto);
        }

    }

    /* zwraca taką samą wartość dla wszystkich samochodów danej klasy

    public static Car drawCar(){

        Random random = new Random();

        int drawCarType = random.nextInt(3);

        if (drawCarType == 0) {
            Opel opel = new Opel();
            return opel;
        } else if (drawCarType == 1){
            Subaru subaru = new Subaru();
            return subaru;
        } else {
            Toyota toyota = new Toyota();
            return toyota;
        }*/
    public static Car drawCar(){
        Random random = new Random();
        int drawCarType = random.nextInt(3);
        int randomSpeed = random.nextInt(40) + 1;
        if (drawCarType == 0) {
            Opel opel = new Opel();
            opel.increaseSpeed(randomSpeed);
            return opel; }
        else if (drawCarType == 1){
            Subaru subaru = new Subaru();
            subaru.increaseSpeed(randomSpeed);
            return subaru; }
        else {
            Toyota toyota = new Toyota();
            toyota.increaseSpeed(randomSpeed);
            return toyota; }
    }

}

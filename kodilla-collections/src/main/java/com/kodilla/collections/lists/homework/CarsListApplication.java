package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Opel> cars = new ArrayList<>();

        Opel astra = new Opel();
        Opel corsa = new Opel();
        Opel insignia = new Opel();

        cars.add(astra);
        cars.add(corsa);
        cars.add(insignia);

        for(Opel listaModeli : cars) {
            CarUtils.describeCar(listaModeli);
            }

        cars.remove(0); //Astra
        cars.remove(corsa);

        for(Opel listaModeli : cars) {
            System.out.println("\nZawartość kolekcji po zmianiach:");
            CarUtils.describeCar(listaModeli);
            System.out.println("rozmiar kolekcji: " + cars.size());

        }

    }
}

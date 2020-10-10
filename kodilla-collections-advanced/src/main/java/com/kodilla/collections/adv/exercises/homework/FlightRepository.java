package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    static List<Flight> getFlightsTable() {

        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Kraków", "Poznań"));
        flights.add(new Flight("Warszawa", "Berlin"));
        flights.add(new Flight("Londyn", "Warszawa"));
        flights.add(new Flight("Kraków", "Gdańsk"));
        flights.add(new Flight("Kraków", "Paryż"));

        return flights;
    }
}
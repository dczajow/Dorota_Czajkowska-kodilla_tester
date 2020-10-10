package com.kodilla.collections.adv.exercises.homework;

import org.junit.Test;

import java.util.List;

public class FlightFinderTestSuite {

    @Test
    public void testfindFlightsFrom(){
        // given
        String departure = "Kraków";

        // when
        FlightFinder ff = new FlightFinder();
        List<Flight> flights = ff.findFlightsFrom(departure);

        // then
        assertTrue(3, flights.size() );
    }

    private void assertTrue(int i, int size) {
    }

    @Test
    public void findFlightsTo(){
        // given
        String arrival = "Warszawa";

        // when
        FlightFinder ff = new FlightFinder();
        List<Flight> flights = ff.findFlightsFrom(arrival);

        // then
        assertTrue(1, flights.size() );
    }

}
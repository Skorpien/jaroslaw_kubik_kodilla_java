package com.kodilla.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsCreator {
    private List<Flight> flightsList = new ArrayList<>();

    public void createFlights () {
           flightsList.add(new Flight("Warsaw", "Helsinki"));
           flightsList.add(new Flight("Radom", "Berlin"));
           flightsList.add(new Flight("Moscow", "Warsaw"));
           flightsList.add(new Flight("Gdansk", "Warsaw"));
           flightsList.add(new Flight("Warsaw", "Gdansk"));
           flightsList.add(new Flight("Warsaw", "Kiev"));
           flightsList.add(new Flight("Kiev", "Helsinki"));
           flightsList.add(new Flight("Helsinki", "Radom"));
    }

    public List<Flight> getFlightsList() {
        return flightsList;
    }
}

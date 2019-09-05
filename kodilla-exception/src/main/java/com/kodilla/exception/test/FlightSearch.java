package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Radom", false);
        airports.put("Pyrzowice", true);
        airports.put("Berlin", true);
        airports.put("Helsinki", true);
        airports.put("Skopije", true);
        airports.put("Lublana", true);
        airports.put("Brasilia", true);
        airports.put("Sydney", true);
        airports.put("Dakar", true);


        if (airports.get(flight.getArrivalAirport())==null || !airports.get(flight.getArrivalAirport())) {
            throw new RouteNotFoundException(flight.getArrivalAirport());
        }
        if(airports.get(flight.getDepartureAirport())==null || !airports.get(flight.getDepartureAirport())) {
            throw new RouteNotFoundException(flight.getDepartureAirport());
        }

    }
}

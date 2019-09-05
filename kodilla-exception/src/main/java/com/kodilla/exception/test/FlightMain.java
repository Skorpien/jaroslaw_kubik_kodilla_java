package com.kodilla.exception.test;

public class FlightMain {
    public static void main (String[] args) throws RouteNotFoundException {
        Flight flight1 = new Flight("Sonsowiec", "Helsinki");
        FlightSearch flightSearch = new FlightSearch();
        try {
            flightSearch.findFlight(flight1);
        }catch (RouteNotFoundException r) {
            System.out.println(r.getException() + " airport does not exist or is closed");
        }
    }
}

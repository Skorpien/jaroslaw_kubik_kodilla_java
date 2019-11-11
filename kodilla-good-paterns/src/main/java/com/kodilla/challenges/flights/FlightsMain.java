package com.kodilla.challenges.flights;



public class FlightsMain {
    public static void main (String[] args) {
        FlightsCreator flightsCreator = new FlightsCreator();
        flightsCreator.createFlights();

        String flightFrom = "Warsaw";
        flightsCreator.getFlightsList().stream()
                .filter(flight -> flightFrom.equals(flight.getFromCity()))
                .forEach(flight -> System.out.println(flight.getFromCity() + " " + flight.getToCity()));

        String flightTo = "Helsinki";
        flightsCreator.getFlightsList().stream()
                .filter(flight -> flightTo.equals(flight.getToCity()))
                .forEach(flight -> System.out.println(flight.getFromCity() + " " + flight.getToCity()));

        System.out.println("\nFlight via");
        String flightVia = "Kiev";
        flightsCreator.getFlightsList().stream()
                .filter(flight -> flightFrom.equals(flight.getFromCity()))
                .filter(flight -> flightVia.equals(flight.getToCity()))
                .forEach(flight -> System.out.println(flight.getFromCity() + " via " + flight.getToCity()));
        flightsCreator.getFlightsList().stream()
                .filter(flight -> flightVia.equals(flight.getFromCity()))
                .filter(flight -> flightTo.equals(flight.getToCity()))
                .forEach(flight -> System.out.println(flight.getToCity()));
    }

}

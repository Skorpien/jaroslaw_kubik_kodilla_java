package com.kodilla.challenges.flights;

import java.util.Objects;

public class Flight {
    private String fromCity;
    private String toCity;

    public Flight(String fromCity, String toCity) {
        this.fromCity = fromCity;
        this.toCity = toCity;
    }

    public String getFromCity() {
        return fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (!Objects.equals(fromCity, flight.fromCity)) return false;
        return Objects.equals(toCity, flight.toCity);
    }

    @Override
    public int hashCode() {
        int result = fromCity != null ? fromCity.hashCode() : 0;
        result = 31 * result + (toCity != null ? toCity.hashCode() : 0);
        return result;
    }
}

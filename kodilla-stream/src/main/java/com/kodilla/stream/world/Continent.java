package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> countries = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }
    public void addCountry(Country country) {
        countries.add(country);
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;
        Continent continent = (Continent) o;
        return continentName.equals(continent.continentName);
    }
}

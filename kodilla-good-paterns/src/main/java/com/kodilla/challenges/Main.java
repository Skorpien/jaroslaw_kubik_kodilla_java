package com.kodilla.challenges;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movies = new HashMap<>(movieStore.getMovies());
        String result;
        result = movies.values().stream().
                flatMap(Collection::stream).
                collect(Collectors.joining("!"));
        System.out.println(result);
    }
}

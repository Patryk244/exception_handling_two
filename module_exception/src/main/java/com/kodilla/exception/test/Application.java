package com.kodilla.exception.test;

public class Application {
    public static void main(String[] args) {
        SearchFlights searchFlights = new SearchFlights();
        //searchFlights.SearchFlightsEngine(new Flight("Poznan", "Gdansk"));
        try {
            searchFlights.SearchFlightsEngine(new Flight("Poznan", "xd"));
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}

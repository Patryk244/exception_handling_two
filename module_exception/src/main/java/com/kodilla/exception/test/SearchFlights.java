package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlights {
    private final Map<String, Boolean> availableFlights  = new HashMap<>();

    public SearchFlights() {
        availableFlights.put("Poznan", true);
        availableFlights.put("Warsaw", false);
    }


    public void SearchFlightsEngine(Flight flight) throws RouteNotFoundException {
        String arrival = flight.getArrivalAirport();
       if (!availableFlights.containsKey(arrival)) {
           throw new RouteNotFoundException("Arrival Airport " + flight.getArrivalAirport() + " not found");
       } else {
           System.out.println("Your flights are available from " + flight.getArrivalAirport());
       }
    }
}

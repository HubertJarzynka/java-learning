package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlights {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightsMap = new HashMap<>();
        flightsMap.put("Warsaw", true);
        flightsMap.put("Paris", true);
        flightsMap.put("Bergamo", true);
        flightsMap.put("London", true);
        flightsMap.put("Wroclaw", false);
        flightsMap.put("Berlin", false);
        flightsMap.put("Dubai", true);

        if (flightsMap.containsKey(flight.getArrivalAirport())) {
            return flightsMap.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("message");
        }
    }
}
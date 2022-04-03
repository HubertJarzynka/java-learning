package com.kodilla.exception.main;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.RouteNotFoundException;
import com.kodilla.exception.test.SearchFlights;

public class ExceptionModuleRunner {

    public static void main(String[] args) {

        Flight flight = new Flight("Warsaw", "xxxx");

        SearchFlights searcher = new SearchFlights();
        try {
            searcher.findFlight(flight);
        } catch (
                RouteNotFoundException e) {
            System.out.println("No this flight at base");
        } finally {
            System.out.println("Search complete");
        }
    }
}
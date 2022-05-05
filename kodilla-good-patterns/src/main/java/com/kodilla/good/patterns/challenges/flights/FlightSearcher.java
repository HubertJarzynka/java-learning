package com.kodilla.good.patterns.challenges.flights;

public class FlightSearcher {
    public static void main(String[] args) {

        FlightBase flightBase = new FlightBase();
        Flight flight = new Flight("WROCLAW", "WARSAW");
        System.out.println("All connecting flight: ");
        System.out.println(flightBase.findConnectingFlight("WARSAW", "WROCLAW"));
        System.out.println("All Flights to this city: ");
        System.out.println(flightBase.findAllFlightsToThisCity("CRACOW"));
        System.out.println("All Flights from this city: ");
        System.out.println(flightBase.findAllFlightsFromThisCity("SZCZECIN"));
    }
}


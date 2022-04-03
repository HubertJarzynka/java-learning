package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
    public RouteNotFoundException(String message) {
        System.out.println("Not found in map");
    }
}
package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
    String exception;

    public RouteNotFoundException(String exception) {
        this.exception = exception;
    }

    public String getException() {
        return this.exception;
    }
}

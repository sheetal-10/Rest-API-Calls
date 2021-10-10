package com.bridgelabz.RestApiCalls.entity;

public class Details {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String details() {
        return "Hello " + getFirstName() + " " + getLastName() + " from BridgeLabz!";
    }
}

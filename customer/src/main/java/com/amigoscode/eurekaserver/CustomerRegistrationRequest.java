package com.amigoscode.eurekaserver;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email)
        {}
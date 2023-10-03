package com.amigoscode;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email)
        {}
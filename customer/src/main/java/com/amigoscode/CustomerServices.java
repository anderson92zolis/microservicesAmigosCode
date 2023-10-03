package com.amigoscode;

public record CustomerServices() {


    public void registerCustomer(CustomerRegistrationRequest request) {

        Customer customer= Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        //todo:check if email is valid
        //todo: check if the email is not taken
        //todo: store customer in db
    }
}

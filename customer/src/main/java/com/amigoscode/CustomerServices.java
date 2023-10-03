package com.amigoscode;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class CustomerServices {

    private final CustomerRepository customerRepository;
    private final RestTemplate restTemplate;

    public void registerCustomer(CustomerRegistrationRequest request) {

        Customer customer= Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        customerRepository.saveAndFlush(customer);
        //todo:check if email is valid
        //todo: check if the email is not taken
        //todo: check if fraudter
        FraudCheckResponse fraudCheckResponce =
                restTemplate.getForObject("http://localhost:8081/api/v1/fraud-check/{customerId}", FraudCheckResponse.class, customer.getId()
        );

        if(fraudCheckResponce.isFraudster()){
            throw new IllegalStateException("FRAUDSTER");
        }
        //todo: sendNotification
    }
}

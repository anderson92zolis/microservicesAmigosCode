package com.amigoscode;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServices {

    private final CustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequest request) {

        Customer customer= Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        customerRepository.save(customer);
        //todo:check if email is valid
        //todo: check if the email is not taken

    }
}

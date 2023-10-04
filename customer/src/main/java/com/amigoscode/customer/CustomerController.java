package com.amigoscode.customer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value= "api/v1/customers")
@AllArgsConstructor
public class CustomerController {
    private final CustomerServices customerServices;
    @PostMapping
    public void registerCustomer(@RequestBody  CustomerRegistrationRequest customerRegistrationRequest) {
        log.info("new customer registration {}", customerRegistrationRequest);
        customerServices.registerCustomer(customerRegistrationRequest);
    };
}

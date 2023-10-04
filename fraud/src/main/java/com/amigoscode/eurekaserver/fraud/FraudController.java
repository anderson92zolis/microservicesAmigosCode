package com.amigoscode.eurekaserver.fraud;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/fraud-check")
@AllArgsConstructor
@Slf4j
public class FraudController {

    private final FraudCheckService fraudCheckService;

    @GetMapping(path = "{customerId}")
    public FraudCheckResponce isFraudster(
            @PathVariable("customerId") Integer customerId){
            boolean isFraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerId);
            log.info("FRAUD CHECK REQUEST FOR CUSTOMER {} ",customerId);
            return new FraudCheckResponce(isFraudulentCustomer);
    }
}

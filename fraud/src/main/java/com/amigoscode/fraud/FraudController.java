package com.amigoscode.fraud;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import com.amigoscode.clients.fraud.FraudCheckResponse;

@RestController
@RequestMapping(value = "api/v1/fraud-check")
@AllArgsConstructor
@Slf4j
public class FraudController {

    private final FraudCheckService fraudCheckService;

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(
            @PathVariable("customerId") Integer customerId){
            boolean isFraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerId);
            log.info("FRAUD CHECK REQUEST FOR CUSTOMER {} ",customerId);
            return new FraudCheckResponse(isFraudulentCustomer);
    }
}

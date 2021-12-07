package com.demo.microservices.currencyexchangeservice.controller;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CircuitBreakerController {

    private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());

    @GetMapping("/sample")
    @Retry(name = "sampleRetry", fallbackMethod = "fallback")
    public String sample() {
        // return "Hello World";
        logger.info("Inside sample method");
        String forObject = new RestTemplate().getForObject("http://localhost:8001/samples", String.class);
        return forObject;
    }

    public String fallback(Exception e) {
        return "fallback";
    }
}

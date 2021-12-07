package com.demo.microservices.currencyexchangeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitBreakerController {

    @GetMapping("/sample")
    public String sample() {
        return "Hello World";
    }
}

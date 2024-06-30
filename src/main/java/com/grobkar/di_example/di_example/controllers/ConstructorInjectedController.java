package com.grobkar.di_example.di_example.controllers;

import com.grobkar.di_example.di_example.services.GreetingService;

public class ConstructorInjectedController {


    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("I'm in the ConstructorInectedController ");
        return greetingService.sayGreeting();
    }
}

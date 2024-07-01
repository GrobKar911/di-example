package com.grobkar.di_example.di_example.controllers;

import com.grobkar.di_example.di_example.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {


    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("I'm in the ConstructorInectedController ");
        return greetingService.sayGreeting();
    }
}

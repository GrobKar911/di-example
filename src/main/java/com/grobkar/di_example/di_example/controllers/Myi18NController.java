package com.grobkar.di_example.di_example.controllers;

import com.grobkar.di_example.di_example.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Myi18NController {

    public Myi18NController(@Qualifier("i18NService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    private final GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

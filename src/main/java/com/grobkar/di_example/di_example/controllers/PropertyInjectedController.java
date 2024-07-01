package com.grobkar.di_example.di_example.controllers;

import com.grobkar.di_example.di_example.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedService")
    @Autowired
    GreetingService greetingService;

    public String sayHello() {
        System.out.println("I'm in the PropertyInjectedController");
        return greetingService.sayGreeting();
    }
}

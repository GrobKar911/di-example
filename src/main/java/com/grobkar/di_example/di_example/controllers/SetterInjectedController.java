package com.grobkar.di_example.di_example.controllers;

import com.grobkar.di_example.di_example.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {


    private GreetingService greetingService;

    @Qualifier("setterInjectedBean")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("I'm in the SetterInjectedController!");
        return greetingService.sayGreeting();
    }
}

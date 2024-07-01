package com.grobkar.di_example.di_example.services;

import org.springframework.stereotype.Service;

@Service("setterInjectedBean")
public class GreetingServiceSetterInjection implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hey, I'm in the SetterController";
    }
}

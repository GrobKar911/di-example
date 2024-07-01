package com.grobkar.di_example.di_example.services;

import org.springframework.stereotype.Service;

@Service("propertyInjectedService")
public class GreetingServicePropertyInjected implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Friends don't let friends property injection!!!";
    }
}

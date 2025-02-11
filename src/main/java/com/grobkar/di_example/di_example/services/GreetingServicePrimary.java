package com.grobkar.di_example.di_example.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimary implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello From the Primary Bean";
    }

}

package com.grobkar.di_example.di_example.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone from Base Service!";
    }
}

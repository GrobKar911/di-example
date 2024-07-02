package com.grobkar.di_example.di_example.controllers;

import com.grobkar.di_example.di_example.services.env.EnvironmentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyEnvironmentController {

    public MyEnvironmentController(@Qualifier("myEnvironmentService")EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    private final EnvironmentService environmentService;

    public String getEnv() {
        return "You're in " + environmentService.getEnv() + " environment";
    }

}

package com.grobkar.di_example.di_example.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service("myEnvironmentService")
public class UserAcceptanceTestingGreetingService implements EnvironmentService {
    @Override
    public String getEnv() {
        return "uat";
    }
}

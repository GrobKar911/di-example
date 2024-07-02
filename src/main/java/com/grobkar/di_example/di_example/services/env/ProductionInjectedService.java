package com.grobkar.di_example.di_example.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service("myEnvironmentService")
public class ProductionInjectedService implements EnvironmentService {

    @Override
    public String getEnv() {
        return "prod";
    }
}

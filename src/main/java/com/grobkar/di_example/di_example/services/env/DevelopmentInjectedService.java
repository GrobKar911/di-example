package com.grobkar.di_example.di_example.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV","default"})
@Service("myEnvironmentService")
public class DevelopmentInjectedService implements EnvironmentService {

    @Override
    public String getEnv() {
        return "dev";
    }
}

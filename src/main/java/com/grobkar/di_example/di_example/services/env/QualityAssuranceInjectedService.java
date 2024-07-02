package com.grobkar.di_example.di_example.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service("myEnvironmentService")
public class QualityAssuranceInjectedService implements EnvironmentService {

    @Override
    public String getEnv() {
        return "qa";
    }
}

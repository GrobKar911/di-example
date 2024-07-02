package com.grobkar.di_example.di_example.services.env;

import org.springframework.stereotype.Service;

@Service()
public interface EnvironmentService {

    String getEnv();

}

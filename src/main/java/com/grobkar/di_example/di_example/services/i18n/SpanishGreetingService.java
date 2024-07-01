package com.grobkar.di_example.di_example.services.i18n;

import com.grobkar.di_example.di_example.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Holla Mundo - ES";
    }
}

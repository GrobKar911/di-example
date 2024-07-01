package com.grobkar.di_example.di_example.services.i18n;

import com.grobkar.di_example.di_example.controllers.Myi18NController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("EN")
@SpringBootTest
class EnglishGreetingServiceTest {

    @Autowired
    Myi18NController myi18NController;

    @Test
    void sayGreeting() {
        System.out.println(myi18NController.sayHello());
    }
}
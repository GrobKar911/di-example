package com.grobkar.di_example.di_example.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"DEV","EN"})
@SpringBootTest
class MyEnvironmentControllerTest {

    @Autowired
    MyEnvironmentController myEnvironmentController;

    @Test
    void getEnv() {
        System.out.println(myEnvironmentController.getEnv());
    }
}
package com.grobkar.di_example.di_example;

import com.grobkar.di_example.di_example.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DiExampleApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void  testAutowireOfController() {
		System.out.println(myController.sayHello());
	}

	@Test
	void testGetControllerFromCtx() {

		MyController myController = applicationContext.getBean(MyController.class);

		System.out.println(myController.sayHello());
	}
	@Test
	void contextLoads() {
	}

}

package com.grobkar.di_example.di_example;

import com.grobkar.di_example.di_example.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiExampleApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("I'm in the Main Method");

		System.out.println(controller.sayHello());
	}

}

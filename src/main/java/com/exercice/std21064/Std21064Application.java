package com.exercice.std21064;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.exercice.std21064.model"})
public class Std21064Application {
	public static void main(String[] args) {
		SpringApplication.run(Std21064Application.class, args);
	}

}

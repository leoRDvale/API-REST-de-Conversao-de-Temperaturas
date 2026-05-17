package com.leonard.calctemperatura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.leonard.calctemperatura")
public class CalctemperaturaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalctemperaturaApplication.class, args);
	}

}

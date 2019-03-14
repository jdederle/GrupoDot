package com.financiamiento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.financiamiento.controlador"})
public class WsFinanciamientoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsFinanciamientoApplication.class, args);
	}
}
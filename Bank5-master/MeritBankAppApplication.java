package com.MeritBankApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.MeritBankApp")
public class MeritBankAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeritBankAppApplication.class, args);
	}

}

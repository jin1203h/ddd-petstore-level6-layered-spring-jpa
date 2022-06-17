package com.demo.ecoorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EcoOrderApplication {

	static ApplicationContext applicationContext;
	public static ApplicationContext getApplicationContext(){
		return applicationContext;
	}

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(EcoOrderApplication.class, args);

	}

}

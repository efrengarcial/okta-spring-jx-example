package com.okta.developer.oktaspringjxexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class DemoApplication {

	Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		logger.info("An INFO Message XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		SpringApplication.run(DemoApplication.class, args);
	}

}


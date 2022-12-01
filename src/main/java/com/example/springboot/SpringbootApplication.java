package com.example.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {
public static final Logger logger=LoggerFactory.getLogger(SpringbootApplication.class);
	public static void main(String[] args) {
		logger.info("Its a continous Integration job");
		SpringApplication.run(SpringbootApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Its my second logger");
		
	}

}

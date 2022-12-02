package com.example.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {
	public static final Logger logger=LoggerFactory.getLogger(SpringbootApplication.class);

	@Test
	void contextLoads() {
		logger.info("Its a test class");
		assertEquals(true, true)
	}

}

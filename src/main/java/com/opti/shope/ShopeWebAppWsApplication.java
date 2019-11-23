package com.opti.shope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ShopeWebAppWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopeWebAppWsApplication.class, args);
	}
	@Bean
	public BCryptPasswordEncoder getBcryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	public SpringApplicationContext getContext() {
		return new SpringApplicationContext();
	}

}

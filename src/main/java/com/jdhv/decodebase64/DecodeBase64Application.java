package com.jdhv.decodebase64;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DecodeBase64Application {

	public static void main(String[] args) {
		SpringApplication.run(DecodeBase64Application.class, args);
	}

}

package com.example.web.reactive.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WebReactiveDemoApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(WebReactiveDemoApplication.class, args);
	}
}

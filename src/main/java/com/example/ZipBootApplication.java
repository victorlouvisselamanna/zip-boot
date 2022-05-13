package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class ZipBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipBootApplication.class, args);
	}

}

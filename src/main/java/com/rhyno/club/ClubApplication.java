package com.rhyno.club;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories

public class ClubApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClubApplication.class, args);
	}

}

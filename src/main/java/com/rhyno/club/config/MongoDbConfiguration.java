package com.rhyno.club.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class MongoDbConfiguration {
	/*
	   * Use the standard Mongo driver API to create a com.mongodb.client.MongoClient instance.
	   */
	   public @Bean MongoClient mongoClient() {
	       return MongoClients.create("mongodb+srv://root:root@devicluster.vffnatm.mongodb.net/rhyno_club");
	   }
	
	
}

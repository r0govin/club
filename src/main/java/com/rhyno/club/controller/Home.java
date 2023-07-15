package com.rhyno.club.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rhyno.club.exception.ValidatorException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/club/home")
public class Home {

	@GetMapping(value = "/welcome")
	public ResponseEntity<String> getWelcomeMessage() {
		throw new RuntimeException();
		//return new ResponseEntity<String>("Welcome Ravikiran", HttpStatus.ACCEPTED);
	}

	@GetMapping(value = "/error")
	public ResponseEntity<String> getErrorMessage() {
		throw new ValidatorException("Error in the input");
	}
}

package com.rhyno.club.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rhyno.club.exception.CustomErrorResponse;
import com.rhyno.club.exception.ValidatorException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ValidatorException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public CustomErrorResponse handleValidatorException(ValidatorException ex) {
		return new CustomErrorResponse(LocalDateTime.now(), "kiran", ex.toString());
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public CustomErrorResponse handleInternalServerException(Exception ex) {
		return new CustomErrorResponse(LocalDateTime.now(), "kiran", "Internal Error");
	}
}

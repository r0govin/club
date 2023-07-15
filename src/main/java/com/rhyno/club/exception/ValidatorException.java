package com.rhyno.club.exception;

import java.util.Arrays;

public class ValidatorException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	String name;
	
	public ValidatorException(String message) {
		super(message);
		this.name = message;
    }

	@Override
	public String toString() {
		return this.name ;
	}
	

	
	
	
}

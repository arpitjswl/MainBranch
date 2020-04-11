package com.synechron.insurance.Buy.Insurance.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class InvalidIdPassed extends RuntimeException{
	public InvalidIdPassed(String message) {
		super(message);
	}
}

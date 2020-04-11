package com.synechron.insurance.Buy.Insurance.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NO_CONTENT)
public class NoDataFound extends RuntimeException {

	public NoDataFound(String message) {
		super(message);
	}
	
}

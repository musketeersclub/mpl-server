package com.mpl.exceptions;

@SuppressWarnings("serial")
public class ApiException extends RuntimeException{
	
	public ApiException(String message) {
		super(message);
	}
	
	public ApiException() {
		super();
	}
}

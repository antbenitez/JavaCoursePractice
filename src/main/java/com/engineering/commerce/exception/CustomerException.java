package com.engineering.commerce.exception;

public class CustomerException extends RuntimeException{
	public CustomerException() {
		super();
	}
	
	public CustomerException(String message) {
		super(message);
	}
}

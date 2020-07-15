package com.iiht.movie.exception;

@SuppressWarnings("serial")
public class ResourceNotFoundException extends RuntimeException {

	public static  String message="Resource Not Found !";

	public ResourceNotFoundException() {
		
	}

	@SuppressWarnings("static-access")
	public ResourceNotFoundException(String message) {
		this.message = message;
	}	
	
}

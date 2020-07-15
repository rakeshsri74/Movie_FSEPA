package com.iiht.movie.exception;

@SuppressWarnings("serial")
public class InsertionFailed extends RuntimeException {
	
	public static  String message="Insertion Failed !";

	public InsertionFailed() {
	}

	@SuppressWarnings("static-access")
	public InsertionFailed(String message) {
		this.message = message;
	}
	
	

}

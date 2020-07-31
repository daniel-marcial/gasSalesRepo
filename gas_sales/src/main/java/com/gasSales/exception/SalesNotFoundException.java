package com.gasSales.exception;

public class SalesNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 8850872256074942869L;

	public SalesNotFoundException() {
	}

	public SalesNotFoundException(String message) {
		super(message);
	}

	public SalesNotFoundException(Throwable cause) {
		super(cause);
	}

	public SalesNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public SalesNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

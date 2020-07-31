package com.gasSales.exception;

public class SalesBadDataException extends RuntimeException {

	private static final long serialVersionUID = -5850157271154040006L;

	public SalesBadDataException() {
	}

	public SalesBadDataException(String message) {
		super(message);
	}

	public SalesBadDataException(Throwable cause) {
		super(cause);
	}

	public SalesBadDataException(String message, Throwable cause) {
		super(message, cause);
	}

	public SalesBadDataException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}

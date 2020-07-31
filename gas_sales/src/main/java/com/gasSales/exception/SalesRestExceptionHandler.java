package com.gasSales.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

@ControllerAdvice
public class SalesRestExceptionHandler {

	
	@ExceptionHandler
	public ResponseEntity<SalesErrorResponse> handleException(SalesNotFoundException exc) {
		
		
		SalesErrorResponse error = new SalesErrorResponse(
											HttpStatus.NOT_FOUND.value(),
											exc.getMessage(),
											System.currentTimeMillis());
		
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<SalesErrorResponse> handleException(SalesBadDataException exc) {
		
		
		SalesErrorResponse error = new SalesErrorResponse(
											HttpStatus.BAD_REQUEST.value(),
											exc.getMessage(),
											System.currentTimeMillis());
		
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	


	@ExceptionHandler
	public ResponseEntity<SalesErrorResponse> handleException(Exception exc) {
		
		
		SalesErrorResponse error = new SalesErrorResponse(
											HttpStatus.BAD_REQUEST.value(),
											exc.getMessage(),
											System.currentTimeMillis());

		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public ResponseEntity<SalesErrorResponse> handleException(InvalidFormatException exc){
		SalesErrorResponse error = new SalesErrorResponse(
				HttpStatus.NOT_ACCEPTABLE.value(),
				exc.getMessage(),
				System.currentTimeMillis());
		
		return new ResponseEntity<>(error, HttpStatus.NOT_ACCEPTABLE);
	} 
	
}






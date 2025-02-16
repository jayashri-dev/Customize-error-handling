package com.rest.webservices.restful_web_services.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//Specialization of @Component for classes that declare @ExceptionHandler, @InitBinder, or @ModelAttribute 
//methods to be shared acrossmultiple @Controller classes. 

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	//ResponseEntityExceptionHandler it is pre Defined class in java to handle Errors
	
	
	// One of the method inside this is ResponseEntityExceptionHandler
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) throws Exception {
		
			
			
			// create  which should be custome Error Message
			
			ErrorDetails errorDetails = new ErrorDetails(LocalDate.now(),
					ex.getMessage(),request.getDescription(false));
			
			 return new ResponseEntity(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
		}
}

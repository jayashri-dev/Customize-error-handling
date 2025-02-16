package com.rest.webservices.restful_web_services.exception;

import java.time.LocalDate;

public class ErrorDetails {
	
	private LocalDate timestamp;
	private String message;
	private String details;
	public ErrorDetails(LocalDate timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setDetails(String details) {
		this.details = details;  
	}
	
	

}

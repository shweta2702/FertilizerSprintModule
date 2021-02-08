package com.cg.main.fertilizer.exception;

import java.time.LocalDate;

public class ErrorDetails {
	/**
	 * Declare variables
	 */
	private String message;
	private LocalDate date;
	private String details;

	public ErrorDetails() {
		
	}
     /**
      * 
      * @param message
      * @param date
      * @param details
      */
	public ErrorDetails(String message, LocalDate date, String details) {
		super();
		this.message = message;
		this.date = date;
		this.details = details;
	}
	
/*
 * @return getMessage
 */
	public String getMessage() {
		return message;
	}
/*
 * @param Message
 */
	public void setMessage(String message) {
		this.message = message;
	}
	/*
	 * @return getDate
	 */
	public LocalDate getDate() {
		return date;
	}
	/*
	 * @param Date
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}
	/*
	 * @return getDetails
	 */
	public String getDetails() {
		return details;
	}
	/*
	 * @param Details
	 */
	public void setDetails(String details) {
		this.details = details;
	}
}
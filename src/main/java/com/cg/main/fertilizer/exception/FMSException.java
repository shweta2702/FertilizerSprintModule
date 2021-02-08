package com.cg.main.fertilizer.exception;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
/**
 * FMSException extends ResponseEntityExceptionHandler for handling internal Spring MVC exceptions.
 * @author Shweta
 *
 */

@ControllerAdvice//@ControllerAdvice beans are then applied in that order at runtime
public class FMSException extends ResponseEntityExceptionHandler{
	
	
	@ExceptionHandler(FertilizerNotValid.class) //Annotation for handling exceptions in specific handler for FertilizerNotFoundException class
	public ResponseEntity<ErrorDetails> handleException(FertilizerNotValid exception, WebRequest request) {
		ErrorDetails details = new ErrorDetails(exception.getMessage(), LocalDate.now(), request.getDescription(false));
		return new ResponseEntity<>(details, HttpStatus.NOT_FOUND);
	}
	
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getFieldErrors()
				.forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));
		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	}

}

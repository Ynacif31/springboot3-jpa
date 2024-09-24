package com.ygornacif.course.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ygornacif.course.services.exceptions.DatabaseException;
import com.ygornacif.course.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardErorr> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		 String error = "Resource not found";
		 HttpStatus status = HttpStatus.NOT_FOUND;
		 StandardErorr err = new StandardErorr(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		 return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardErorr> database(DatabaseException e, HttpServletRequest request){
		 String error = "Database Error";
		 HttpStatus status = HttpStatus.BAD_REQUEST;
		 StandardErorr err = new StandardErorr(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		 return ResponseEntity.status(status).body(err);
	}
}

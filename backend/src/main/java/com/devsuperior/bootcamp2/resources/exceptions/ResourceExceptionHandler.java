package com.devsuperior.bootcamp2.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.devsuperior.bootcamp2.services.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> entityNotFound(ResourceNotFoundException enfe, HttpServletRequest hsr) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError se = new StandardError();
		se.setTimestamp(Instant.now());
		se.setStatus(status.value());
		se.setError("Error: Resource Not found");
		se.setMessage(enfe.getMessage());
		se.setPath(hsr.getRequestURI());
		return ResponseEntity.status(status).body(se);
	}

}

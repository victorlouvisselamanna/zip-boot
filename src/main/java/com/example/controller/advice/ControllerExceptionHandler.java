package com.example.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.model.exception.ResourceNotFoundException;

import lombok.AllArgsConstructor;
import lombok.Data;

@RestControllerAdvice
public class ControllerExceptionHandler {

	@Data
	@AllArgsConstructor
	private class ErrorMessage {
		private String msg;
	}
	
	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ErrorMessage resourceNotFoundException(ResourceNotFoundException ex)
	{
		return new ErrorMessage(ex.getMessage());
	}
}

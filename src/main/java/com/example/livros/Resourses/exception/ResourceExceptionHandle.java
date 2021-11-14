package com.example.livros.Resourses.exception;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.livros.services.exeception.ObjectNotFoundExcepion;

@ControllerAdvice
public class ResourceExceptionHandle {

	@ExceptionHandler(ObjectNotFoundExcepion.class)
	
	
	public ResponseEntity<StandardError> objectNotFoundExcepion(ObjectNotFoundExcepion e, ServletRequest request){
		StandardError error = new StandardError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(), e.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
	
}

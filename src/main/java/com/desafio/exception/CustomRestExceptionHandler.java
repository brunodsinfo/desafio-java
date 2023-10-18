package com.desafio.exception;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class CustomRestExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		MensagemException erroRetorno = new MensagemException(status.value(), ex.getBindingResult().getFieldError().getField(),ex.getBindingResult().getFieldError().getDefaultMessage() );
		
		return super.handleExceptionInternal(ex, erroRetorno, headers, status, request);
	}

	
	@Override
	protected ResponseEntity<Object> handleNoHandlerFoundException(NoHandlerFoundException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		
		MensagemException erroRetorno = new MensagemException(status.value(), ex.getCause().getMessage() ,ex.getMessage());
				
		return super.handleExceptionInternal(ex,erroRetorno, headers, status, request);

	}
	

	@Override
	protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		MensagemException erroRetorno = new MensagemException(status.value(), ex.getCause().getMessage() ,ex.getMessage());
		return super.handleExceptionInternal(ex,erroRetorno, headers, status, request);
		             
	}
	
	@Override
	protected ResponseEntity<Object> handleServletRequestBindingException(ServletRequestBindingException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		MensagemException erroRetorno = new MensagemException(status.value(), ex.getCause().getMessage() ,ex.getMessage());
		return super.handleExceptionInternal(ex, erroRetorno, headers, status, request);
	}
	

	
}

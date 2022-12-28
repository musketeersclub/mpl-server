package com.mpl.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class PlayerExceptionHandler {

	@ResponseBody
	@ExceptionHandler(PlayerNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String,String> playerExceptionHandler(PlayerNotFoundException exception){
		Map<String,String> errorMap=new HashMap<>();
		errorMap.put("errorMessage", exception.getMessage());
		return errorMap;
	}
	@ResponseBody
	@ExceptionHandler(ApiException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public Map<String,String> apiExceptionHandler(ApiException exception){
		Map<String,String> errorMap=new HashMap<>();
		errorMap.put("errorMessage", exception.getMessage());
		return errorMap;
	}
}

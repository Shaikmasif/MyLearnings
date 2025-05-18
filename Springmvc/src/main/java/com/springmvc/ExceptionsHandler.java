package com.springmvc;

import java.util.InputMismatchException;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
@ControllerAdvice
public class ExceptionsHandler {

	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHandler(Model model) {
		model.addAttribute("msg","Null Pointer Exception has occured.");
		return "errorPage";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value= InputMismatchException.class)
	public String exceptionHandlerInput(Model model) {
		model.addAttribute("msg","Input Mismatch Exception has occured.");
		return "errorPage";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String genericExceptionHandler(Model m) {
		m.addAttribute("msg","Some exception has occured");
		return "errorPage";
	}
}

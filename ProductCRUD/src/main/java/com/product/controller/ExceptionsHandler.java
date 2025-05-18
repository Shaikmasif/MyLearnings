package com.product.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionsHandler {
	@ExceptionHandler(value=Exception.class)
	public String errorPage(Model m) {
		m.addAttribute("m","Some Error Has Occured");
		return "errorPage";
	}

}

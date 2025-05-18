package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	@RequestMapping("/f")
		public String form() {
			return "formError";
		}
	
	
	@RequestMapping("/handleForm")
	public String handleForm(@ModelAttribute("user") User user,BindingResult result) {
		
		if(result.hasErrors()) {
			return "formError";
		}
		System.out.println(user);
		
		return "formError";
	}
}

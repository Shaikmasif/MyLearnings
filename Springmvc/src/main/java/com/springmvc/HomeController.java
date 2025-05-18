package com.springmvc;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.InputMismatchException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.Student;
import com.springmvc.service.RegistrationService;

@Controller
public class HomeController {
	@Autowired
	private RegistrationService registrationService;
	
	@RequestMapping(value="/form")
	public String Home() {
		return "form";
	}
	
	@RequestMapping(value="/welcome")
	public String welcome(@RequestParam("name") String name, Model m) {
		System.out.println(name);
		m.addAttribute("name",name);	
		
		return "welcome";
	}
	
	
	
	
	
//	@RequestMapping("/home")
//	@RequestMapping(path="/home",method=RequestMethod.GET)
	@GetMapping("/home")
	public String home(Model model) {
//		String a = null;
//		System.out.println(a.length());
//		int a = "asd";
		model.addAttribute("Name","Asif");
		model.addAttribute("marks", Arrays.asList("10,20,30"));
		return "home";
	}
	
	@RequestMapping("/subjects")
	public ModelAndView subjects() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("subjects",Arrays.asList("java","javascript"));
		mv.addObject("time",LocalDateTime.now());
		mv.setViewName("subjects");
		return mv;
	}
	
	@RequestMapping("/register")
	public String register(Model model) {
		model.addAttribute("welcome","Welcome to S/W development");
		
		return "register";
	}
	
	@RequestMapping(path="/registration", method=RequestMethod.POST)
	public String registration(@ModelAttribute("student") Student student,
			Model model) {
//		String userName = req.getParameter("userName");
//		String email = req.getParameter("email");
//		String password = req.getParameter("paTssword");
		String userName = student.getUsername();
		String email = student.getEmail();
		String password = student.getPassword();	
		
		System.out.println(userName+" "+email+" "+password);
		
		int r = registrationService.saveUser(student);
		System.out.println(r);
		
		
		return "success"; 
			
	}

}

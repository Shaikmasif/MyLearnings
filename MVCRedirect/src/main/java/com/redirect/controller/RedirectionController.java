package com.redirect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectionController {
	
	@RequestMapping("/search")
	public String search() {
		return "search";
	}

	@RequestMapping(path="/search", method=RequestMethod.POST)
	public RedirectView searching(@RequestParam("keyword") String keyword) {
		String url="http://www.google.com/search?q="+keyword;
		RedirectView rv = new RedirectView();
		rv.setUrl(url);
		return rv;
	}	
}

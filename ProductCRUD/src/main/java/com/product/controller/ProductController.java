package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.product.dao.ProductDao;
import com.product.model.Product;

@Controller
public class ProductController {
	
	@Autowired
	private ProductDao productDaoImpl;
	
	@RequestMapping("/")
	public String home(Model model) {
		List<Product> list = productDaoImpl.getAllProduct();
		model.addAttribute("products", list);
		return "index";	
	}
	
	@RequestMapping(path="/add-product")
	public String productPage() {
		return "addProduct";
	}
	
	@RequestMapping(value="/addProduct", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product p,Model m) {
		productDaoImpl.createProduct(p);
		return "redirect:/";
	}
	
	@RequestMapping(path="/edit-product/{id}")
	public String editProduct(@PathVariable("id") int id, Model model) {
		Product product = productDaoImpl.getProduct(id);
		model.addAttribute("product",product);
		return "editProduct";
	}
	
	@RequestMapping(path="/deleteProduct/{id}")
	public String deleteProduct(@PathVariable("id") int id) {
		productDaoImpl.deleteProduct(id);
		return "redirect:/";
	}
	
	@RequestMapping(value="/editProduct",method=RequestMethod.POST)
	public String editingProduct(@ModelAttribute("product") Product p) {
		System.out.println(p);
		productDaoImpl.updateProduct(p);
		return "redirect:/";
	}
	

}

package com.product.dao;

import java.util.List;

import com.product.model.Product;

public interface ProductDao {
	
	public void createProduct(Product p);
	
	public List<Product> getAllProduct();
	
	public Product getProduct(int id);
	
	public void updateProduct(Product p);
	
	public void deleteProduct(int id);

}

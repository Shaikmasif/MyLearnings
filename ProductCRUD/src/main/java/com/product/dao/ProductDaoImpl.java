package com.product.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.product.model.Product;
@Component
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public void createProduct(Product p) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(p);
		
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		
		return products;
	}

	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		
		return this.hibernateTemplate.get(Product.class, id);
	}

	@Override
	@Transactional
	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.saveOrUpdate(p);
		
	}

	@Override
	@Transactional
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		Product p = this.hibernateTemplate.get(Product.class, id);
		this.hibernateTemplate.delete(p);
	}

}

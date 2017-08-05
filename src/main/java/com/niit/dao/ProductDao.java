package com.niit.dao;

import java.util.List;

import com.niit.model.Product;


public interface ProductDao {
	
	public void saveProduct(Product product);//create and update product
	public void deleteProduct(Integer productId);//delete particular product
	public List<Product> getAllProducts();//read all products
	
	public Product getProductById(int pid);// read product based on id
	
	
	
}

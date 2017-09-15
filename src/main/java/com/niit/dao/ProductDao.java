package com.niit.dao;

import java.util.List;

import com.niit.model.Product;
import com.niit.model.User;


public interface ProductDao {
	
	public void saveProduct(Product product);//create and save product
	public void deleteProduct(int productId);//delete particular product
	public List<Product> getAllProducts();//read all products
	public void updateProduct(Product product);//update product
	public Product getProductById(int pid);// returns product object based on id	
	
	public List<Product> getProductByCategoryId(int cid);
}

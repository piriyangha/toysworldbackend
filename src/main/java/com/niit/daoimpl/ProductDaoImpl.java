package com.niit.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDao;
import com.niit.model.Product;
@Repository(value="productdao")
@Transactional
public class ProductDaoImpl implements ProductDao {
	@Autowired
	SessionFactory sessionFactory;
	

	public void saveProduct(Product product)
	{
		sessionFactory.getCurrentSession().save(product);
	}
	
	public void deleteProduct(Integer productId)
	{
		sessionFactory.getCurrentSession().delete(getProductById(productId));
	}
	
	public List<Product> getAllProducts() {
		
		return sessionFactory.getCurrentSession().createQuery("from Product", Product.class).list();
	}
	public void updateProduct(Product product)
	{
		sessionFactory.getCurrentSession().update(product);
	}
	
	public Product getProductById(int productId) {
		
		return (Product)sessionFactory.getCurrentSession().get(Product.class, productId);// ( fetch the pid from (product.class) refers to the product class file)
	}
	
}

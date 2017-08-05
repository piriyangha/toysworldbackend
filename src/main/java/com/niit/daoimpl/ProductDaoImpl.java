package com.niit.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDao;
import com.niit.model.Product;
@Repository
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
	
	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts() {
		
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}
	
	public Product getProductById(int productId) {
		
		return (Product)sessionFactory.getCurrentSession().get(Product.class, productId);
	}
	
}

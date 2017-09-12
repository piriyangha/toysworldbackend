package com.niit.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDao;
import com.niit.model.Product;
import com.niit.model.User;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
	@Autowired
	SessionFactory sessionFactory;

	public void saveProduct(Product product) {
		sessionFactory.getCurrentSession().save(product);
	}

	public void deleteProduct(int productId) {
		sessionFactory.getCurrentSession().delete(getProductById(productId));
	}

	public List<Product> getAllProducts() {

		return sessionFactory.getCurrentSession().createQuery("FROM Product", Product.class).list();
	}

	public void updateProduct(Product product) {
		sessionFactory.getCurrentSession().update(product);
	}

	public Product getProductById(int pid) {
		return (Product) sessionFactory.getCurrentSession().get(Product.class, pid);
		
	}

	/*public Product getProductById(int productId) {

		
	} */
	public List<Product> getProductByCategoryId(int cid) { 
		  return sessionFactory.getCurrentSession().createQuery("From Product where cid='cid'",Product.class).list();
		  }

	public User getUserByUsername(String username) {
		
		User user = (User) sessionFactory.getCurrentSession().createQuery("FROM User WHERE username = '"+username+"'").uniqueResult();
		
		return user;
	}
	 
}

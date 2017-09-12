package com.niit.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.CartDao;
import com.niit.model.Cart;
@Repository("CartDao")
public class CartDaoImpl implements CartDao {
@Autowired
SessionFactory sessionFactory;
	public Cart getCartById(int cartId) {
		
		return null;
	}

	public void saveOrUpdate(Cart cart) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(cart);
	}

	public List<Cart> getCartByUsername(String username) {
		
		return null;
	}

}

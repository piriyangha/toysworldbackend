package com.niit.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.CartItemDao;
import com.niit.model.Cart;
import com.niit.model.CartItem;

@Repository("CartItemDao")
public class CartItemDaoImpl implements CartItemDao{
@Autowired
SessionFactory sessionFactory;

	
	public CartItem getCartItemById(int pid,int cartid) {

		return (CartItem) sessionFactory.getCurrentSession().createQuery("FROM CartItem WHERE product_pid = '"+pid+"' AND  cart_cartid = '"+cartid+"'").uniqueResult();
	}
	/*public void deleteAllCartItem(int cartId) {
	
		
		List<CartItem> cartItems=cart.getCartItem();
		for(CartItem cartItem:cartItems)
		{
			sessionFactory.getCurrentSession().get(Cart.class,cartId).delete(cartItem);
		}	
	}*/
	/*public void addCartItem(CartItem cartItem) {
	sessionFactory.getCurrentSession().saveOrUpdate(cartItem);
	
}

public void deleteCartItem(int cartItemId) {
	
	sessionFactory.getCurrentSession().delete(getCartItemById(cartItemId));
}*/

		
	}



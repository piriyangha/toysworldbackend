package com.niit.dao;

import java.util.List;

import com.niit.model.Cart;

public interface CartDao {

	 public Cart getCartById (int cartId);
	    // Cart validate(int cartId) throws IOException;
		   public void saveOrUpdate(Cart cart);
		   List<Cart> getCartByUsername (String username);
}

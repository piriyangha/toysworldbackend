package com.niit.dao;


import com.niit.model.CartItem;

public interface CartItemDao {
	
	
	public void deleteCartItem(int cartitemid);
	public CartItem getCartItemById(int pid,int cartid);
	public CartItem getCartItemByCartItemId(int cartitemid);
	
	

	

	
}

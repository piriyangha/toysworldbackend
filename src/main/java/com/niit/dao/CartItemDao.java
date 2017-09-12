package com.niit.dao;


import com.niit.model.CartItem;

public interface CartItemDao {
	/*public void addCartItem(CartItem cartItem);

	public void deleteCartItem(int cartItemId);*/
	
	//public void deleteAllCartItem(int cartId);
	public CartItem getCartItemById(int pid,int cartid);

	
}

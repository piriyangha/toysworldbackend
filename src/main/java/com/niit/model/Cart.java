package com.niit.model;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Component
public class Cart {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
  private int id;
	@OneToMany
 private List<CartItem> cartItem;
  private float grandTotal;
  private int quantity;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public List<CartItem> getCartItem() {
	return cartItem;
}
public void setCartItem(List<CartItem> cartItem) {
	this.cartItem = cartItem;
}
public float getGrandTotal() {
	return grandTotal;
}
public void setGrandTotal(float grandTotal) {
	this.grandTotal = grandTotal;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

}

package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class CartItem {
	@Id
	@ GeneratedValue (strategy=GenerationType.AUTO)
	private int id;
    private int subQuantity;
    private float subTotal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSubQuantity() {
		return subQuantity;
	}
	public void setSubQuantity(int subQuantity) {
		this.subQuantity = subQuantity;
	}
	public float getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}
}

package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name="Product")
public class Product {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int Pid;
	private String Pname;
	private float Price;
	private String Brandname;
	
	public int getPid() {
		return Pid;
	}

	
	public void setPid(int pid) {
		Pid = pid;
	}

	
	public String getPname() {
		return Pname;
	}

	
	public void setPname(String pname) {
		Pname = pname;
	}

	
	public float getPrice() {
		return Price;
	}

	
	public void setPrice(float price) {
		Price = price;
	}

	public String getBrandname() {
		return Brandname;
	}
	
}

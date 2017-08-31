package com.niit.model;

import javax.persistence.Transient;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.Table;


import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;




@Component

@Entity
@Table (name="Product")
public class Product {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	
	private int pid;
	//@NotNull(message="Name should not be empty")
	private String pname;
	
	private float price;
	private String brandname;
	private String stock;
	
	@ManyToOne 
	private Category category;
	
	
	@Transient
	private MultipartFile image;
	
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getPid() {
		return pid;
	}
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getPname() {
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	 
	public String getBrandname() {
		return brandname;
	}
	
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	
	public String getStock() {
		return stock;
	}
	
	public void setStock(String stock) {
		this.stock = stock;
	}
}
	
	
	
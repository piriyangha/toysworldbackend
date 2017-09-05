package com.niit.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;                                                                                                                                            
import javax.persistence.Table;


import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="Category")
public class Category {
	 @Id 
	 @GeneratedValue (strategy=GenerationType.AUTO)
	 
	 private int cid;
	 private String catname;
	 
	/* @OneToMany(mappedBy="category")
	 private List<Product> product;
	
	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}*/

	public int getCid() {
		return cid;
	}
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public String getCatname() {
		return catname;
	}
	
	public void setCatname(String catname) {
		this.catname = catname;
	}
		

}

package com.niit.handlers;

import java.io.Serializable;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.niit.dao.ProductDao;
import com.niit.dao.UserDao;
import com.niit.model.BillingAddress;
import com.niit.model.User;

@Component("flowHandler")
public class FlowHandler implements Serializable{

	@Autowired
	UserDao userDao;
	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	User user;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 113338062526435128L;

	public BillingAddress initHandler(int userId){
		user = userDao.getUserByUserId(userId);
		System.out.println("User : "+user.getUsername());
		return new BillingAddress();
	}
	
	public void saveBillAddress(BillingAddress billingAddress){
		System.out.println("Billing Address Saved");
	}
}

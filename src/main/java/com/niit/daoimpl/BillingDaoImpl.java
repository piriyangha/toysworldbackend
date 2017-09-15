package com.niit.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.BillingDao;
import com.niit.model.BillingAddress;

@Repository("BillingDao")
@Transactional
public class BillingDaoImpl implements BillingDao {
@Autowired
SessionFactory sessionFactory;
	public void saveOrUpdate(BillingAddress billingAddress) {
		sessionFactory.getCurrentSession().saveOrUpdate(billingAddress);
		
	}

	
}

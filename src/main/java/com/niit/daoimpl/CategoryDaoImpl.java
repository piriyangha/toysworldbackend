package com.niit.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CategoryDao;
import com.niit.model.Category;
import com.niit.model.Product;
@Repository
@Transactional
public class CategoryDaoImpl implements CategoryDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public void saveCategory(Category cat)
	{
		sessionFactory.getCurrentSession().save(cat);
	}
      public List<Category> retrieveAllCategory()
      {
    	  return sessionFactory.getCurrentSession().createQuery("FROM Category", Category.class).list();
	  }

	
	

}

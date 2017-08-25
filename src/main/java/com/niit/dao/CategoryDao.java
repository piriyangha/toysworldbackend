package com.niit.dao;

import java.util.List;

import com.niit.model.Category;

public interface CategoryDao {
	public List<Category> retrieveAllCategory();
	public void saveCategory(Category cat);
	

}

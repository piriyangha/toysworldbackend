package com.niit.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UserDao;
import com.niit.model.User;

@Repository
@Transactional
public class userdaoimpl implements UserDao {
	@Autowired
	SessionFactory sessionFactory;

	public void saveUser(User user) {
		try {
			System.out.println(user.getUsername());
			sessionFactory.getCurrentSession().saveOrUpdate(user);

			System.out.println(user.getUsername());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public User getUserByUserId(int userId) {
		
		return sessionFactory.getCurrentSession().get(User.class, userId);
	}
}

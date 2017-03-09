package com.lql.spring.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lql.spring.dao.UserDao;
import com.lql.spring.entity.User;
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public Serializable addUser(User user) {
		return sessionFactory.getCurrentSession().save(user);
	}

}

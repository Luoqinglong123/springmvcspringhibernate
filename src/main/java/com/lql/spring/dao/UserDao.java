package com.lql.spring.dao;

import java.io.Serializable;

import com.lql.spring.entity.User;

public interface UserDao {
	Serializable addUser(User user);
}

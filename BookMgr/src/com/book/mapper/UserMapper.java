package com.book.mapper;

import java.util.List;
import java.util.Map;

import com.book.model.User;

public interface UserMapper {
	
	void addSingleUser(User user);
	
	int deleteUserById(int id);
	
	int updateUserById(User user);

	List<User> listGetAll();
	
	User getUserByid(int id);
	
	User getUserByNameAndPwd(User user);
}

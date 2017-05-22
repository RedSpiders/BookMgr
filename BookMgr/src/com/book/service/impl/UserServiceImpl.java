package com.book.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.book.mapper.UserMapper;
import com.book.model.User;
import com.book.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	/**
	 * userMapper对象
	 */
	@Resource
	private UserMapper userMapper;

	/**
	 * 
	 * 方法描述：请在这里填写方法具有xxxx作用.
	 * <p/>
	 * @param user  
	 * <p/>
	 * 创建者：wangyan
	 * <p/> 
	 * 创建时间：2017-5-18 下午5:49:11
	 */
	@Override
	public void addUser(User user) {
		
	}

	/**
	 * 
	 * 方法描述：请在这里填写方法具有xxxx作用.
	 * <p/>
	 * @param id  
	 * <p/>
	 * 创建者：wangyan
	 * <p/> 
	 * 创建时间：2017-5-18 下午5:49:29
	 */
	@Override
	public void deleteUser(int id) {
		
	}

	/**
	 * 
	 * 方法描述：请在这里填写方法具有xxxx作用.
	 * <p/>
	 * @param user  
	 * <p/>
	 * 创建者：wangyan
	 * <p/> 
	 * 创建时间：2017-5-18 下午5:49:36
	 */
	@Override
	public void updateUser(User user) {
		
	}

	/**
	 * 
	 * 方法描述：请在这里填写方法具有xxxx作用.
	 * <p/>
	 * @return  
	 * <p/>
	 * 创建者：wangyan
	 * <p/> 
	 * 创建时间：2017-5-18 下午5:49:41
	 */
	@Override
	public List<User> listGetAllUser() {
		return null;
	}

	/**
	 * 
	 * 方法描述：请在这里填写方法具有xxxx作用.
	 * <p/>
	 * @param id
	 * @return  
	 * <p/>
	 * 创建者：wangyan
	 * <p/> 
	 * 创建时间：2017-5-18 下午5:49:45
	 */
	@Override
	public User getUserById(int id) {
		return null;
	}

	/**
	 * 
	 * 方法描述：请在这里填写方法具有xxxx作用.
	 * <p/>
	 * @param user
	 * @return  
	 * <p/>
	 * 创建者：wangyan
	 * <p/> 
	 * 创建时间：2017-5-18 下午5:49:49
	 */
	@Override
	public User getUserByNameAndPwd(User user) {
		return null;
	}


	
	
	
	
	 
	
}

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
	 * userMapper����
	 */
	@Resource
	private UserMapper userMapper;

	/**
	 * 
	 * ��������������������д��������xxxx����.
	 * <p/>
	 * @param user  
	 * <p/>
	 * �����ߣ�wangyan
	 * <p/> 
	 * ����ʱ�䣺2017-5-18 ����5:49:11
	 */
	@Override
	public void addUser(User user) {
		
	}

	/**
	 * 
	 * ��������������������д��������xxxx����.
	 * <p/>
	 * @param id  
	 * <p/>
	 * �����ߣ�wangyan
	 * <p/> 
	 * ����ʱ�䣺2017-5-18 ����5:49:29
	 */
	@Override
	public void deleteUser(int id) {
		
	}

	/**
	 * 
	 * ��������������������д��������xxxx����.
	 * <p/>
	 * @param user  
	 * <p/>
	 * �����ߣ�wangyan
	 * <p/> 
	 * ����ʱ�䣺2017-5-18 ����5:49:36
	 */
	@Override
	public void updateUser(User user) {
		
	}

	/**
	 * 
	 * ��������������������д��������xxxx����.
	 * <p/>
	 * @return  
	 * <p/>
	 * �����ߣ�wangyan
	 * <p/> 
	 * ����ʱ�䣺2017-5-18 ����5:49:41
	 */
	@Override
	public List<User> listGetAllUser() {
		return null;
	}

	/**
	 * 
	 * ��������������������д��������xxxx����.
	 * <p/>
	 * @param id
	 * @return  
	 * <p/>
	 * �����ߣ�wangyan
	 * <p/> 
	 * ����ʱ�䣺2017-5-18 ����5:49:45
	 */
	@Override
	public User getUserById(int id) {
		return null;
	}

	/**
	 * 
	 * ��������������������д��������xxxx����.
	 * <p/>
	 * @param user
	 * @return  
	 * <p/>
	 * �����ߣ�wangyan
	 * <p/> 
	 * ����ʱ�䣺2017-5-18 ����5:49:49
	 */
	@Override
	public User getUserByNameAndPwd(User user) {
		return null;
	}


	
	
	
	
	 
	
}

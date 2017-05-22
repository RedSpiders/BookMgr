package com.book.service;

import java.util.List;
import java.util.Map;

import com.book.model.User;

public interface UserService {

	/**
	 * 
	 * 方法描述：添加用户.
	 * <p/>
	 * @param user  
	 * <p/>
	 * 创建者：wangyan
	 * <p/> 
	 * 创建时间：2017-5-18 下午5:44:28
	 */
	public void addUser(User user);
	
	/**
	 * 
	 * 方法描述：删除用户.
	 * <p/>
	 * @param id  
	 * <p/>
	 * 创建者：wangyan
	 * <p/> 
	 * 创建时间：2017-5-18 下午5:44:43
	 */
	public void deleteUser(int id);
	
	/**
	 * 
	 * 方法描述：修改用户信息.
	 * <p/>
	 * @param user  
	 * <p/>
	 * 创建者：wangyan
	 * <p/> 
	 * 创建时间：2017-5-18 下午5:44:55
	 */
	public void updateUser(User user);
	
	/**
	 * 
	 * 方法描述：查询所有用户.
	 * <p/>
	 * @return  
	 * <p/>
	 * 创建者：wangyan
	 * <p/> 
	 * 创建时间：2017-5-18 下午5:45:06
	 */
	public List<User> listGetAllUser();
	
	public User getUserById(int id);
	
	public User getUserByNameAndPwd(User user);
	
	
}

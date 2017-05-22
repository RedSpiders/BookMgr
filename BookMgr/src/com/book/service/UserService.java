package com.book.service;

import java.util.List;
import java.util.Map;

import com.book.model.User;

public interface UserService {

	/**
	 * 
	 * ��������������û�.
	 * <p/>
	 * @param user  
	 * <p/>
	 * �����ߣ�wangyan
	 * <p/> 
	 * ����ʱ�䣺2017-5-18 ����5:44:28
	 */
	public void addUser(User user);
	
	/**
	 * 
	 * ����������ɾ���û�.
	 * <p/>
	 * @param id  
	 * <p/>
	 * �����ߣ�wangyan
	 * <p/> 
	 * ����ʱ�䣺2017-5-18 ����5:44:43
	 */
	public void deleteUser(int id);
	
	/**
	 * 
	 * �����������޸��û���Ϣ.
	 * <p/>
	 * @param user  
	 * <p/>
	 * �����ߣ�wangyan
	 * <p/> 
	 * ����ʱ�䣺2017-5-18 ����5:44:55
	 */
	public void updateUser(User user);
	
	/**
	 * 
	 * ������������ѯ�����û�.
	 * <p/>
	 * @return  
	 * <p/>
	 * �����ߣ�wangyan
	 * <p/> 
	 * ����ʱ�䣺2017-5-18 ����5:45:06
	 */
	public List<User> listGetAllUser();
	
	public User getUserById(int id);
	
	public User getUserByNameAndPwd(User user);
	
	
}

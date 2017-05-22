package com.book.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.book.mapper.UserMapper;
import com.book.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/config/spring-common.xml")
public class UserTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void query(){
		List<User> resultList = userMapper.listGetAll();
		System.out.println(resultList.size());
		if (resultList != null && resultList.size() > 0) {
			for (User user : resultList) {
				System.out.println(user.getUser_Name());
			}
		}
		
	}
	
	@Test
	public void addUser(){
		User user = new User();
//		user.setUser_Id("18");
		user.setUser_Name("ζ§ΌΊ");
		user.setUser_Iden("0");
		userMapper.addSingleUser(user);
		System.out.println(user.getUser_Id());
	}
	@Test
	public void deleteUserById(){
		int num = userMapper.deleteUserById(8);
		System.out.println(num);
	}
	@Test
	public void updateUserById(){
		User user = new User();
		user.setUser_Id("3");
		user.setUser_Name("Αυ±Έ");
		user.setUser_Pwd("666666");
		int num = userMapper.updateUserById(user);
		System.out.println(num);
	}
	@Test
	public void selectUser(){
		User user =userMapper.getUserByid(8);
		System.out.println(user);
	}
	@Test
	public void getUserByNameAndPwd(){
		User user = new User();
		user.setUser_Name("wangwu");
		user.setUser_Pwd("123");
		User user2 = userMapper.getUserByNameAndPwd(user);
		System.out.println(user2);
	}
	
}

package com.book.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.book.model.User;
import com.book.service.UserService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String checkUser(HttpServletRequest request){
		User user = new User();
		
		user.setUser_Name(request.getParameter(""));
		user.setUser_Pwd(request.getParameter(""));
		
		return "main";
	}
	
}

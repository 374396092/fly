package com.neuedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.service.PostService;
import com.neuedu.service.UserService;

@Controller
public class PostController {
	@Autowired
	private PostService postServlet;
	@Autowired
	private UserService userServlet;
	@RequestMapping("/")
	 private String  index(){
		return "index";		 
	 }
	
	

}

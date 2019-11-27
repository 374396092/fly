package com.neuedu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.neuedu.po.TabUser;
import com.neuedu.service.UserService;

@Controller
public class IndexController {
	@Autowired
	private UserService userService;
	@RequestMapping("/")
     public String index(){
    	return "index";
     }
	@ResponseBody
	@RequestMapping("/login")
	public String login(TabUser user1,HttpSession session){
		System.out.println(user1);
		String msg="";
		TabUser user = userService.login(user1);
		if(user==null){
			msg= "0";

		}else{
			session.setAttribute("user", user);
			msg= "1";
		}
		return msg;
		
		   
		
		
	/*@RequestMapping("/login")
	public String login(TabUser user1,HttpSession session){
		
		TabUser user = userService.login(user1);
		System.out.println(user);
		if(user!=null){
			session.setAttribute("user", user);
			return "user/index";
		}else{
			return "index" ;
		}
		
		
	}*/
}}

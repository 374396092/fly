package com.neuedu.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.neuedu.po.TabClassify;
import com.neuedu.po.TabUser;
import com.neuedu.service.NovelService;
import com.neuedu.service.SystemService;

@Controller
public class IndexController {
	@Autowired
	private NovelService novelService;
	@Autowired
	private SystemService systemService;
	@RequestMapping("/")
	public ModelAndView index(){
		List<TabClassify> classifyList = novelService.getclassifylist();
		System.out.println(classifyList);
		ModelAndView mv = new ModelAndView();
		mv.addObject("classifyList", classifyList);
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("login")
	@ResponseBody
	public String login(TabUser user,HttpSession session){
		String s = null;
		TabUser loginuser = systemService.login(user);
		if( loginuser == null){
			s = "0";
		}else{
			session.setAttribute("user", loginuser);
			s = "1";
		}
		return s;
		
	}
	@RequestMapping("logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:/";
	}
	

}

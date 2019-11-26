package com.neuedu.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.neuedu.po.TabClassify;
import com.neuedu.po.TabNovel;
import com.neuedu.po.TabUser;
import com.neuedu.service.NovelService;

@Controller
@RequestMapping("system")
public class SystemContorller {
	@Autowired
	private NovelService novelService;

	@RequestMapping("index")
	public ModelAndView index(HttpSession session) {
		TabUser user = (TabUser) session.getAttribute("user");
		List<TabNovel> novellist = novelService.getnoveLlistByauthor(user.getId());
		ModelAndView mv = new ModelAndView();
		mv.addObject("novellist", novellist);
		mv.setViewName("system/index");
		return mv;
	}

	@RequestMapping("novel")
	@ResponseBody
	public String novel(int id) {		
		TabNovel novel = novelService.getnovel(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("novel", novel);
		mv.setViewName("system/novel");
		return JSON.toJSONString(novel);
	}
	@RequestMapping("addnoveljsp")
	public ModelAndView addnoveljsp(){
		ModelAndView mv = new ModelAndView();
		List<TabClassify> classifylist = novelService.getclassifylist();
		mv.addObject("classifylist", classifylist);
		mv.setViewName("system/addnovel");
		return mv;
		
	}
	@RequestMapping("addnovel")
	public String addnovel(MultipartFile novelfile,TabNovel novel ,HttpSession session, HttpRequest request){
		TabUser user = novel.
		return "";
		
	}
}

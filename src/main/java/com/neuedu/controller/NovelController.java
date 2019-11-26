package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.neuedu.po.TabClassify;
import com.neuedu.po.TabNovel;
import com.neuedu.po.TabUnit;
import com.neuedu.service.NovelService;

@Controller
@RequestMapping("novel")
public class NovelController {
	@Autowired
	private NovelService novelService;
	@RequestMapping("novellist/{id}")
	public ModelAndView novellist(@PathVariable("id") int id){
		List<TabClassify> classifyList = novelService.getclassifylist();
		List<TabClassify> tabClassify = novelService.getnovellist(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("classifyList", classifyList);
		mv.addObject("tabClassify",tabClassify);
		mv.setViewName("novellist");
		return mv;
	}
	@RequestMapping("getnoveldis/{id}")
	public ModelAndView getnoveldis(@PathVariable("id") int id){
		ModelAndView mv = new ModelAndView();
		TabNovel novel = novelService.getnovel(id);
		mv.setViewName("novel");
		mv.addObject("novel",novel);
		return mv;
	}
	@RequestMapping("getaddarticlejsp")
	public ModelAndView getaddarticlejsp(){
		int nextunitid = novelService.getnextunitid(5);
		ModelAndView mv = new ModelAndView();
		mv.addObject("nextunitid",nextunitid);
		mv.setViewName("addarticle");
		return mv;
	}
	@RequestMapping("addunit")
	public String addunit(TabUnit unit){
		System.out.println(unit);
		return "";
	}
	@RequestMapping("getclassify")
	@ResponseBody
	public String getclassify(){
		List<TabClassify> list = novelService.getclassifylist();		
		return JSON.toJSONString(list);		
	}
	public String updatenovel(MultipartFile novelfile,TabNovel novel){
		return "redirect:/system/index";
		
	}
}

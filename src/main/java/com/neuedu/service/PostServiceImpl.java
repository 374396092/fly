package com.neuedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.neuedu.dao.PostMapper;
import com.neuedu.po.PageDomain;
import com.neuedu.po.TabAnswer;
import com.neuedu.po.TabFlyKiss;
import com.neuedu.po.TabPost;
import com.neuedu.po.TabSpecialColumn;
import com.neuedu.po.TabUser;

@Service
public class PostServiceImpl implements PostService{
	@Autowired
	private PostMapper postMapper;

	@Override
	public int getPostCount(TabUser user) {
		// TODO Auto-generated method stub
		return postMapper.getPostCount(user);
	}

	@Override
	public int getCollPostCount(TabUser user) {
		// TODO Auto-generated method stub
		return postMapper.getCollPostCount(user);
	}

	@Override
	public List<TabPost> getpost(TabUser user) {
		// TODO Auto-generated method stub
		return postMapper.getpost(user);
	}

	@Override
	public List<TabPost> getcollpost(TabUser user) {
		// TODO Auto-generated method stub
		return postMapper.getcollpost(user);
	}

	@Override
	public List<TabSpecialColumn> getSpecialColumn() {
		// TODO Auto-generated method stub
		return postMapper.getSpecialColumn();
	}

	@Override
	public List<TabFlyKiss> getFlyKiss() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPost(TabPost post) {
		// TODO Auto-generated method stub
		postMapper.addPost(post);
	}

	@Override
	public List<TabPost> getpostlist(String selectcondition, PageDomain pagedomain) {
		// TODO Auto-generated method stub
		return postMapper.getpostlist(selectcondition, pagedomain);
	}

	@Override
	public TabPost detailpost(int id) {
		// TODO Auto-generated method stub
		return postMapper.detailpost(id);
	}

	@Override
	public List<TabAnswer> getanswerlist(int id) {
		// TODO Auto-generated method stub
		return postMapper.getanswerlist(id);
	}



}

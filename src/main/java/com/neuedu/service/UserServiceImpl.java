package com.neuedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dao.UserMapper;
import com.neuedu.po.TabArea;
import com.neuedu.po.TabUser;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public TabUser findUser(TabUser user) {
		// TODO Auto-generated method stub
		return userMapper.findUser(user);
	}

	@Override
	public TabUser findUser2(String email) {
		// TODO Auto-generated method stub
		return userMapper.findUser2(email);
	}

	@Override
	public void regist(TabUser user) {
		// TODO Auto-generated method stub
		userMapper.regist(user);
	}

	@Override
	public List<TabArea> getarea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateinfo(TabUser user) {
		// TODO Auto-generated method stub
		userMapper.updateinfo(user);
	}



}

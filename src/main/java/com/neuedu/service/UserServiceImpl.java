package com.neuedu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.dao.TabUserMapper;
import com.neuedu.po.TabUser;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
     private TabUserMapper tabUserMapper;
	@Override
	public TabUser login(TabUser user) {
		// TODO Auto-generated method stub
		return tabUserMapper.login(user);
	}

}

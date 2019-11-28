package com.neuedu.service;

import java.util.List;

import com.neuedu.po.TabArea;
import com.neuedu.po.TabUser;

public interface UserService {
	TabUser findUser(TabUser user);
	TabUser findUser2(String email);
	void regist(TabUser user);
	List<TabArea> getarea();
	void updateinfo(TabUser user);

}

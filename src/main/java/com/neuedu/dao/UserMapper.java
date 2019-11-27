package com.neuedu.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.neuedu.po.TabArea;
import com.neuedu.po.TabUser;

public interface UserMapper {
	TabUser findUser(TabUser user);
	TabUser findUser2(String email);
	void regist(TabUser user);
	List<TabArea> getarea();
	void updateinfo(TabUser user);
	

}

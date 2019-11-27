package com.neuedu.dao;

import java.sql.Connection;
import java.util.List;

import com.neuedu.po.PageDomain;
import com.neuedu.po.TabAnswer;
import com.neuedu.po.TabFlyKiss;
import com.neuedu.po.TabPost;
import com.neuedu.po.TabSpecialColumn;
import com.neuedu.po.TabUser;


public interface PostMapper {
	int getPostCount(TabUser user);
	int getCollPostCount(TabUser user);
	List<TabPost> getpost(TabUser user);
	List<TabPost> getcollpost(TabUser user);
	List<TabSpecialColumn> getSpecialColumn();
	List<TabFlyKiss> getFlyKiss();
	void addPost(TabPost post);
	List<TabPost> getpostlist(String selectcondition,PageDomain pagedomain);
	TabPost detailpost(int id);
	List<TabAnswer> getanswerlist(int id);
	int updatecount(int view_count);

}

package com.neuedu.po;

import java.util.Date;

import com.neuedu.util.DateUtil;

public class TabAnswer {
	private int id;
	private String answer_content;
	private Date answer_time;
	private TabUser user;
	private int post_id;
	private int is_accept;
	private int agree_num;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer_content() {
		return answer_content;
	}
	public void setAnswer_content(String answer_content) {
		this.answer_content = answer_content;
	}
	public String getAnswer_time() {
		return DateUtil.getDateString(answer_time);
	}
	public void setAnswer_time(Date answer_time) {
		this.answer_time = answer_time;
	}
	public TabUser getUser() {
		return user;
	}
	public void setUser(TabUser user) {
		this.user = user;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public int getIs_accept() {
		return is_accept;
	}
	public void setIs_accept(int is_accept) {
		this.is_accept = is_accept;
	}
	public int getAgree_num() {
		return agree_num;
	}
	public void setAgree_num(int agree_num) {
		this.agree_num = agree_num;
	}

}

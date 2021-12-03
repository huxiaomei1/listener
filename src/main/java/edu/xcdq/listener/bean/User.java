package edu.xcdq.listener.bean;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

import edu.xcdq.listener.bean.User;
import edu.xcdq.listener.constant.Constants;


public class User implements HttpSessionBindingListener{
	private int id;
	private String userName;
	private String password;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void valueBound(HttpSessionBindingEvent event) {
		Constants.USER_COUNT++;
	}
	public void valueUnbound(HttpSessionBindingEvent event) {
		Constants.USER_COUNT--;
	}
	
	
}

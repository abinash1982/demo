package com.sql.demo;

public class UserInput {
	private static final String QUERY="SELECT * FROM users WHERE name = '"; 
	private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getQuery() {
		return  QUERY+ this.userName + "'";
	}
	
}

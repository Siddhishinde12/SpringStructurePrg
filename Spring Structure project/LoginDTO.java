package com.infosys.dto;

public class LoginDTO {
	
	String username;
	String pwd;
	public LoginDTO() {
		super();
	}
	public LoginDTO(String username, String pwd) {
		super();
		this.username = username;
		this.pwd = pwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "LoginDTO [username=" + username + ", pwd=" + pwd + "]";
	}
	
	

}

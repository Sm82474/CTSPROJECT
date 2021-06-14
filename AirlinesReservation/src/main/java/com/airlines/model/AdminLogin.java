package com.airlines.model;

public class AdminLogin {

	private int adminId;
	private String emailId;
	private String password;
	

	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public AdminLogin(int adminId, String emailId, String password) {
		super();
		this.adminId = adminId;
		this.emailId = emailId;
		this.password = password;
	}
	public AdminLogin() {
		// TODO Auto-generated constructor stub
	}
	

}

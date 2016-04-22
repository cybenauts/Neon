package com.infe.model;

public class User 
{
	private String username;
	private String password;
	private String name;
	private String phone;
	private String dob;
	private String gender;
	
	
	public User() {
		super();
	}
	public User(String username, String password, String name, String phone,
			String dob, String gender) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.dob = dob;
		this.gender = gender;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}	
}

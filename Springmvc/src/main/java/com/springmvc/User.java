package com.springmvc;

public class User {
	
	String email, password;
	
	Long id;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getUserName() {
		return id;
	}

	public void setUserName(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", id=" + id + ", password=" + password + "]";
	}
	

}

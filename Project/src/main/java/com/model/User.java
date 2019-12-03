package com.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;
/*import javax.validation.constraints.NotEmpty;*/

/*import org.hibernate.validator.constraints.NotEmpty;*/

@SuppressWarnings("deprecation")
public class User {
	@NotEmpty(message="please enter the password")
	private String userName;
	private long userId;
	@NotEmpty(message="please enter the password")
	@Min(value=5)
	@Max(value=8)
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

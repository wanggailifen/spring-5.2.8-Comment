package com.hoho.bean;




/**
 * @Classname Student
 * @Description TODO
 * @Author Jack
 * Date 2020/12/7 15:41
 * Version 1.0
 */

public class Student {
    private String username = "jack";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Student{" +
				"username='" + username + '\'' +
				'}';
	}
}

package com.webser.vo;

public class UserVO {
	private int userId;
	private String userName;
	private String phoneNumber;
	private int age;
	
	public UserVO(){
		
	}
 
	public UserVO(int userId,String userName,String phoneNumber,int age) {
		this.userId=userId;
		this.userName=userName;
		this.phoneNumber=phoneNumber;
		this.age=age;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}

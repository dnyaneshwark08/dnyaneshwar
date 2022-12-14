package com.springbootmvc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="task6_user")
public class User {

	@Id
	private String userName;
	private String password;
	private String name;
	private String email;
	private String contact;
	private String address;
	
	public User(String userName, String password, String name, String email, String contact, String address) {
		super();
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.address = address;
	}

	public User() {
		super();
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", name=" + name + ", email=" + email
				+ ", contact=" + contact + ", address=" + address + "]";
	}
	
	
}

package com.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name = "user")
@Entity
@Component
public class User {

@Id
@Column(name="UserId")
@GeneratedValue
private int userId;

private String username;

private String email;

private String password;

private int contact;

private String address;

private boolean enabled;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="UserId")

private Role role;

public Role getRole()
{
	return role;
}

public void setRole(Role role)
{
	this.role=role;
}

public boolean isEnabled() {
	return enabled;
}

public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getUserName() {
	return username;
}

public void setUserName(String userName) {
	this.username = userName;
}

public String getEmail() {
	return email;
}

public void setEmailId(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public int getContactNumber() {
	return contact;
}

public void setContactNumber(int contactNumber) {
	this.contact = contactNumber;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}


}
package com.mph.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
private String username;

@Autowired
private Car car;
public User() {
	super();
	// TODO Auto-generated constructor stub
}

public User(String username, Car car) {
	super();
	this.username = username;
	this.car = car;
}

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}
@Override
public String toString() {
	return "User [username=" + username + ", car=" + car + "]";
}

}

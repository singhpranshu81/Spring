package com.mph.props;

public class DBServer {
private String dbURL;
private String username;
private String password;
public DBServer() {
	super();
	// TODO Auto-generated constructor stub
}
public String getDbURL() {
	return dbURL;
}
public void setDbURL(String dbURL) {
	this.dbURL = dbURL;
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
@Override
public String toString() {
	return "DBServer [dbURL=" + dbURL + ", username=" + username + ", password=" + password + "]";
}

}

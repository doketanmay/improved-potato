package com.lti.junit;



import java.util.HashMap;

public class LoginService {
	
	public HashMap<String, String> users = new HashMap<String,String>();
	
	public LoginService() {
		users.put("tanmay", "123");
		users.put("aditya", "456");
		users.put("aditi", "789");
	}
	
	public boolean isValidUser(String username, String password) {
			
		if(users.containsKey(username.toLowerCase()) & users.get(username.toLowerCase()).equals(password)) 
			return true;
		else
			return false;
		
	}

}

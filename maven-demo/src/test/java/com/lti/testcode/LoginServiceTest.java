package com.lti.testcode;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.junit.LoginService;

public class LoginServiceTest {

	@Test
	public void testcase1() {
		
		LoginService loginService= new LoginService();
		boolean validorNot = loginService.isValidUser("tanmay", "222");
		boolean expected = false;
		assertEquals(expected, validorNot);
				
	}
	
	@Test
	public void testcase2() {
		
		LoginService loginService= new LoginService();
		boolean validorNot = loginService.isValidUser("tanmay", "123");
		boolean expected = true;
		assertEquals(expected, validorNot);
				
	}
	
	@Test
	public void testcase3() {
		
		LoginService loginService= new LoginService();
		boolean validorNot = loginService.isValidUser("TANMAY", "123");
		boolean expected = true;
		assertEquals(expected, validorNot);
				
	}

}

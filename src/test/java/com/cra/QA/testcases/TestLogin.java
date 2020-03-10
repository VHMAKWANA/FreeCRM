package com.cra.QA.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cra.QA.base.TestBase;
import com.cra.QA.base.customListner;
import com.cra.QA.pages.HomePage;
import com.cra.QA.pages.LoginPage;

@Listeners(customListner.class)

public class TestLogin extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	

	public TestLogin() {
		super();
	}
	

	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
	}

	@Test(priority = '1')
	public void title() {
		String title = loginpage.validatelogintitle();
		System.out.println(title);
		

	}

	@Test(priority = '2')
	public void image() {

		loginpage.validateCRMimage();

	}

	@Test(priority = '3')
	public void login() {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
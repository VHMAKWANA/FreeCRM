package com.cra.QA.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cra.QA.base.TestBase;
import com.cra.QA.base.customListner;
import com.cra.QA.pages.DealsPage;
import com.cra.QA.pages.HomePage;
import com.cra.QA.pages.LoginPage;
import com.cra.QA.utill.TestUtill;
@Listeners(customListner.class)

public class DealTest extends TestBase {
	
	
	LoginPage loginPage;
	HomePage homePage;
	DealsPage dealspage;
	
	public DealTest() {
		super();
	}

	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		dealspage=homePage.dealpage();

	}
	
	@DataProvider
	public Object[][] getdata() {
		Object data[][]=TestUtill.getTestData("Login");
		return data;
	}
	@Test(dataProvider = "getdata")
	public void newdeal(String title, String textarea, String prob)  {
		dealspage.newdeal(title, textarea, prob);
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
}

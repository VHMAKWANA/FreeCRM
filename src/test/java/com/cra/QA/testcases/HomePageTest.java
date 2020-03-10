package com.cra.QA.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cra.QA.base.TestBase;
import com.cra.QA.base.customListner;
import com.cra.QA.pages.ContactsPage;
import com.cra.QA.pages.HomePage;
import com.cra.QA.pages.LoginPage;



@Listeners(customListner.class)
public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = '1')

	public void usercheck() {
		homePage.user();
		Assert.assertTrue(homePage.user());
	}

	@Test(priority = '2')
	public void contactspagetest() {
		homePage.contactspage();
		
		
	}

	@Test(priority = '3')
	public void Dealspagetest() {
		homePage.dealpage();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

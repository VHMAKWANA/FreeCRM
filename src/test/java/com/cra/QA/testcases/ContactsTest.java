package com.cra.QA.testcases;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.cra.QA.base.TestBase;
import com.cra.QA.base.customListner;
import com.cra.QA.pages.ContactsPage;
import com.cra.QA.pages.HomePage;
import com.cra.QA.pages.LoginPage;
import com.cra.QA.utill.TestUtill;

@Listeners(customListner.class)
public class ContactsTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactspage;

	public ContactsTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactspage = homePage.contactspage();

	}
	
	@DataProvider
	public Object[][] getdata() {
		Object data[][]=TestUtill.getTestData("Login");
		return data;
	}

	@Test(dataProvider = "getdata")
	public void newcontact(String name,String lastname, String company)  {
		contactspage.Newcontact(name, lastname, company);
		
	}
	@Test
	public void data() {
		System.out.println("v");
	}

	@AfterMethod()
	public void teardown() {
		driver.quit();
	}

}

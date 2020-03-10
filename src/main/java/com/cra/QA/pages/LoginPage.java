package com.cra.QA.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cra.QA.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name = "email")
    WebElement username;
	
	@FindBy(name= "password")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement signin;
	
	@FindBy(xpath="//*[@id=\"onesignal-bell-launcher\"]")
	WebElement crmLogo;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		}
	
	public String validatelogintitle() {
		 return  driver.getTitle();
	}
	public Boolean validateCRMimage() {
		 return crmLogo.isDisplayed();
	}
	public HomePage login(String un, String pwd ) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		signin.click();
		return new HomePage();
	}
	
}

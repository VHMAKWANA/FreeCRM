package com.cra.QA.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cra.QA.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath = "//span[text()='Vijay Makwana ']")
	WebElement user;
	
	@FindBy(xpath = "//a[@href='/contacts']")
	WebElement contactslink;
	
	@FindBy(xpath ="//span[text()='Deals']")
	WebElement Dealslink;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public Boolean user() {
		 return user.isDisplayed();
	}
	
	public ContactsPage contactspage() {
		  contactslink.click();
		  return new ContactsPage();
				  
	}
	public DealsPage dealpage() {
		Dealslink.click();
		return new DealsPage();
		
	}
	
	

}

package com.cra.QA.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cra.QA.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")
	WebElement NEWcontact;
	
	@FindBy(xpath = "//input[@name='first_name']")
	WebElement name1 ;
	
	@FindBy(xpath = "//input[@name='last_name']")
	WebElement lastname1;
	
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/input")
	WebElement company1;
	
	@FindBy(xpath = "//button[@class='ui linkedin button']")
	WebElement save;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	

	public void Newcontact(String name,String lastname, String company) {
		NEWcontact.click();
		name1.sendKeys(name);
		lastname1.sendKeys(lastname);
		company1.sendKeys(company);
		save.click();
	}
	
	
	
	
	

}

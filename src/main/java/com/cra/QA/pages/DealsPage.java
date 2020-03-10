package com.cra.QA.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cra.QA.base.TestBase;

public class DealsPage extends TestBase {

	@FindBy(xpath = "//a[@href='/deals/new']")
	WebElement newdeal;
	
	@FindBy(xpath = "//input[@name='title']")
	WebElement Title;

	@FindBy(xpath = "//textarea[@name='description']")
	WebElement Textarea;
	
	
	@FindBy(xpath = "//*[@class='ui fluid selection dropdown']")
	WebElement dropdown;
	
	@FindBy(xpath = "//*[@class='visible menu transition']")
	WebElement text;
	
	@FindBy(xpath = "//input[@name='probability']")
	WebElement Prob;
	
	
	@FindBy(xpath = "//i[@class='save icon']")
	WebElement save;
	
	public DealsPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void newdeal(String title, String textarea, String prob) {
		newdeal.click();
		Title.sendKeys(title);
		Textarea.sendKeys(textarea);
		Prob.sendKeys(prob);
		dropdown.click();
		text.click();
		save.click();
		}
	
	
	
	
	
	
	
	
	
	
	
	
}

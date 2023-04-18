package com.ssnbanking.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ssnbanking.qa.base.TestBase;

public class HomePage extends TestBase {
	
	//Page Factory
	@FindBy(xpath="//h2[text()='Guru99 Bank']")
	WebElement logo;
	
	@FindBy(xpath="//a[text()='Delete Customer']")
	WebElement deleteCustomerBtn;
	
	//initialize
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//actions
	public String validateTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		return logo.isDisplayed();
	}
	
	public DeleteCustomerPage clickDeleteCustomerBtn() {
		deleteCustomerBtn.click();
		return new DeleteCustomerPage();
	}

}

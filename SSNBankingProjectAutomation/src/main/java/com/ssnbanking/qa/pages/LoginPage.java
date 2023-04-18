package com.ssnbanking.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ssnbanking.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory
	@FindBy(xpath="//input[@name='uid']")
	WebElement usernameTextBox;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordTextBox;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement loginBtn;
	
	@FindBy(xpath="//h2[text()='Guru99 Bank']")
	WebElement logo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//actions
	public String validateTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		return logo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) {
		usernameTextBox.sendKeys(un);
		passwordTextBox.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
}

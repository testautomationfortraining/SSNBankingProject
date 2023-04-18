package com.ssnbanking.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ssnbanking.qa.base.TestBase;

public class DeleteCustomerPage extends TestBase {
	
	//Page Factory
//	@FindBy(xpath="//span[text()='Close']")
//	WebElement closeBtn;
	
	@FindBy(xpath="//input[@name='cusid']")
	WebElement customerIdTextBox;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement submitBtn;
	
	//initialize the Page Factory
	public DeleteCustomerPage() {
		PageFactory.initElements(driver, this);
	}
	
	//actions
	public void deleteCustomer(String custId) {
//		WebElement closeBtn=driver.findElement(By.xpath("//span[text()='Close']"));
//		if(closeBtn.isDisplayed()) {
//			closeBtn.click();
//		} else {
//			System.out.println("Close Button is not displayed");
//		}
		driver.switchTo().alert().accept();
		customerIdTextBox.sendKeys(custId);
		submitBtn.click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
	}

}

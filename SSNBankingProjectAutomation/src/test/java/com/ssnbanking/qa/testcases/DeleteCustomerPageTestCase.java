package com.ssnbanking.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ssnbanking.qa.base.TestBase;
import com.ssnbanking.qa.pages.DeleteCustomerPage;
import com.ssnbanking.qa.pages.HomePage;
import com.ssnbanking.qa.pages.LoginPage;

public class DeleteCustomerPageTestCase extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	DeleteCustomerPage deleteCustomerPage;
	
	public DeleteCustomerPageTestCase() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		deleteCustomerPage=homePage.clickDeleteCustomerBtn();
	}
	
	@Test
	public void deleteTheCustomer() throws InterruptedException {
		Thread.sleep(2000);
		deleteCustomerPage.deleteCustomer(prop.getProperty("customerId"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

package com.ssnbanking.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ssnbanking.qa.base.TestBase;
import com.ssnbanking.qa.pages.DeleteCustomerPage;
import com.ssnbanking.qa.pages.HomePage;
import com.ssnbanking.qa.pages.LoginPage;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	DeleteCustomerPage deleteCustomerPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=0)
	public void validateHomePageTitle() {
		String actualTitle=homePage.validateTitle();
		Assert.assertNotEquals(actualTitle, "Test", "The test message should not be displayed");
	}
	
	@Test(priority=1)
	public void validateHomePageLogo() {
		Assert.assertTrue(homePage.validateLogo());
	}
	
	@Test(priority=2)
	public void navigateToDeleteCustomerPage() throws InterruptedException {
		deleteCustomerPage=homePage.clickDeleteCustomerBtn();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

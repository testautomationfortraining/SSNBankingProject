package com.ssnbanking.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ssnbanking.qa.base.TestBase;
import com.ssnbanking.qa.pages.HomePage;
import com.ssnbanking.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
	}
	
	@Test(priority=0)
	public void validateLoginPageTitle() {
		String actualTitle=loginPage.validateTitle();
		Assert.assertEquals(actualTitle, "Guru99 Bank Home Page");
	}
	
	@Test(priority=1)
	public void validateLoginPageLogo() {
		Assert.assertTrue(loginPage.validateLogo());
	}
	
	@Test(priority=2)
	public void loginToApp() {
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

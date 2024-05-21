package com.swaglab.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglab.base.Base;
import com.swaglab.page.AllProductPage;
import com.swaglab.page.LoginPage;

public class TC_002 extends Base {

	LoginPage login;
	AllProductPage allproduct;

	@Test(description = "Login Functionality with invalid username and password")
	public void tc_002() {

		login = new LoginPage(driver);
		allproduct = new AllProductPage(driver);
		login.enterUsername("standard_u");
		login.enterPassword("secret_s");
		login.clickOnLoginBtn();

		Assert.assertTrue(login.error.isDisplayed());

	}

}

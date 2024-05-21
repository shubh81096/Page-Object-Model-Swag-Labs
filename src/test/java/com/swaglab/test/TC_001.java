package com.swaglab.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglab.base.Base;
import com.swaglab.page.AllProductPage;
import com.swaglab.page.LoginPage;

public class TC_001 extends Base {

	LoginPage login;
	AllProductPage allproduct;

	@Test(description = "Login Functionality with valid username and password")
	public void tc_001() {

		login = new LoginPage(driver);
		allproduct = new AllProductPage(driver);
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickOnLoginBtn();

		Assert.assertTrue(allproduct.productHeading.isDisplayed(), "Webelment is not displayed: ");

	}

}

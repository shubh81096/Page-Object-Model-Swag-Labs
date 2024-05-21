package com.swaglab.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglab.base.Base;
import com.swaglab.page.AllProductPage;
import com.swaglab.page.LoginPage;
import com.swaglab.page.SingleProductPage;

public class TC_003 extends Base {

	LoginPage login;
	AllProductPage allproduct;
	SingleProductPage singleproduct;

	@Test(description = "Verify that product can be addded into shopping cart")
	public void tc_001() throws InterruptedException {

		login = new LoginPage(driver);
		allproduct = new AllProductPage(driver);
		singleproduct = new SingleProductPage(driver);
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickOnLoginBtn();
		Thread.sleep(3000);
		Assert.assertTrue(allproduct.productHeading.isDisplayed(), "Webelment is not displayed: ");

		allproduct.Sauce_Labs_Backpack.click();
		Thread.sleep(3000);

		singleproduct.Sauce_Labs_Backpack_AddToCartBtn.click();
		Thread.sleep(3000);

	}

}

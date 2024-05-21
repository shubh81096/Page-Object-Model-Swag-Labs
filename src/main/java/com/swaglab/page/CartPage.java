package com.swaglab.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {


	@FindBy(xpath = "//div[@class='inventory_details_desc_container']//button[text()='Add to cart']")
	public WebElement Sauce_Labs_Backpack_AddToCartBtn;
	
	
	public CartPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

}

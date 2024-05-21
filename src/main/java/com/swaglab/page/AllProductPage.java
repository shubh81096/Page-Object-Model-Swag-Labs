package com.swaglab.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllProductPage {

	@FindBy(xpath = "//span[text()='Products']")
	public WebElement productHeading;

	@FindBy(xpath = "//div[@class='inventory_item']//*[text()='Sauce Labs Backpack']")
	public WebElement Sauce_Labs_Backpack;

	@FindBy(xpath = "//div[@class='inventory_list']//div[@class='inventory_item_name ']")
	public List<WebElement> allProducts;

	@FindBy(xpath = "//div[@class='inventory_list']//*[text()='Add to cart']")
	public List<WebElement> allProductsAddToCartBtn;

	public AllProductPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void addAllProductToCart() {

		for (WebElement webElement : allProductsAddToCartBtn) {

			try {
				webElement.click();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

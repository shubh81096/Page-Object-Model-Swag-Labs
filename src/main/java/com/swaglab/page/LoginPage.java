package com.swaglab.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "user-name")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login-button")
	private WebElement loginBtn;

	@FindBy(xpath = "//div[text()='Swag Labs']")
	private WebElement swagLabHeading;
	
	@FindBy(xpath = "//*[text()='Epic sadface: Username and password do not match any user in this service']")
	public WebElement error;
	
	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void enterCred(String user, String pass) {

		username.sendKeys(user);
		password.sendKeys(pass);

	}

	public void enterUsername(String user) {

		username.sendKeys(user);

	}

	public void enterPassword(String pass) {

		password.sendKeys(pass);

	}

	public void clickOnLoginBtn() {

		loginBtn.click();
	}
	

	
	

}

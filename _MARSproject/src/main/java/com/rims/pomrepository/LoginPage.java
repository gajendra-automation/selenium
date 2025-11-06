package com.rims.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rims.utils.LaunchBaseClass;

public class LoginPage {
	public WebDriver driver;
	
	public  LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath="//input[@type='text']")////input[@type='text']
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordTextField;
	
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginButton;
	
	public void setEmail(String username) {
		usernameTextfield.click();
		usernameTextfield.sendKeys(username);
	}
	
	public void setPassword(String password) {
	passwordTextField.sendKeys(password);
	}
	
	public void clkLogin() throws InterruptedException {
		 loginButton.click();
		 Thread.sleep(4000);
	}


	
}

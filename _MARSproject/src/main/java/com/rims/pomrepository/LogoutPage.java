package com.rims.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rims.utils.LaunchBaseClass;

public class LogoutPage extends LaunchBaseClass {
	public WebDriver driver;
	public   LogoutPage(WebDriver driver) {
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[@class='pull-right']//img)[1]")
	private WebElement profileIcon;
	public void clkProfileIcon() {
		webdriverutils.elementVisibility(driver, profileIcon).click();
	}
	
	@FindBy(xpath="//*[@id='v-menu-v-9']/div/div/div[4]")
	private WebElement logoutButton;
	public void getlogoutButton() throws InterruptedException {
		
		logoutButton.click();
	}
	
}
